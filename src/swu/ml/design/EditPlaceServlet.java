package swu.ml.design;

import com.alibaba.fastjson.JSON;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/editplace")
public class EditPlaceServlet extends HttpServlet {
    private static final long serialVersionUID=763921866686380L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        System.out.println("id=" + id);
        String sql = "SELECT * FROM destination WHERE id=" + id;

        List<Destination> destinations = null;
        try {
            destinations = DBUtils.getDestinations(sql);

            if (destinations.size() == 0) {
                response.sendRedirect("./gallery_root.html");
            }
            Destination destination = destinations.get(0);
            StringBuilder sb = new StringBuilder();
            response.setContentType("application/json;charset=UTF-8");
            String pageJson = JSON.toJSONString(destination);
            System.out.println(pageJson);
            response.getWriter().write(pageJson);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /*private String toJson(Destination destination) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(
                    "{'id':%s,'place':'%s','describe':'%s','img':'%s'}",
                    destination.getId(), destination.getPlace(), destination.getDescribe(), destination.getImg()
            ));
        System.out.println("id=" + destination.getId() + "place=" + destination.getPlace() + "describe=" + destination.getDescribe() + "img=" + destination.getImg());
        return sb.toString();
    }*/


}
