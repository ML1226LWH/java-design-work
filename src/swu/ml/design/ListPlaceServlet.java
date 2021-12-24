package swu.ml.design;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

public class ListPlaceServlet extends HttpServlet {
    private static final long serialVersionUID = -3074193570054134659L;
    public  void  doGet(HttpServletRequest request, HttpServletResponse response){
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        String page = request.getParameter("page");

        int offset = (Integer.valueOf(page).intValue() - 1) * 4;

        String sql = "SELECT * FROM destination ORDER BY id DESC LIMIT 2 OFFSET " + offset;

        System.out.println(sql);

        try {
            List<Destination> destinations = DBUtils.getDestination(sql);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try(Writer writer = response.getWriter()) {
                writer.write(this.toJson(destinations));
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    private String toJson(List<Destination> destinations) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"destinations\": [");

        for(int i=0; i<destinations.size(); i++) {
            Destination destination = destinations.get(i);
            if (i > 0) sb.append(",");
            sb.append(String.format(
                    "{\"id\": %s, \"place\": \"%s\",\"describe\": \"%s\",\"img\": \"%s\"}",
                    destination.getId(), destination.getPlace(), destination.getDescribe(), destination.getImg()
            ));
            System.out.println("id="+destination.getId()+"place="+destination.getPlace()+"describe="+destination.getDescribe()+"img="+destination.getImg());
        }
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }
}

