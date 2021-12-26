package swu.ml.design;

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

        String sql = "SELECT * FROM books WHERE id=" + id;

        Destination destination = null;
        try {
            destination = DBUtils.getDestination(sql);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try (Writer writer = response.getWriter()) {
                writer.write(this.toJson(destination));
            }
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try (Writer writer = response.getWriter()) {
                writer.write(this.toJson(destination));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
        private String toJson(Destination destination) {
        StringBuilder sb = new StringBuilder();
            sb.append(String.format(
                    "{\"id\": %s, \"place\": \"%s\",\"describe\": \"%s\",\"img\": \"%s\"}",
                    destination.getId(), destination.getPlace(), destination.getDescribe(), destination.getImg()
            ));
        return sb.toString();
    }
}
