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
        System.out.println("id="+id);
        String sql = "SELECT * FROM destination WHERE id=" + id;

        List<Destination> destinations = null;
        try {
            destinations = DBUtils.getDestinations(sql);

            if(destinations.size()==0){
                response.sendRedirect("./gallery_root.html");
            }
            Destination destination=destinations.get(0);
            StringBuilder sb =new StringBuilder();
            sb.append(buildPlaceForm(destination));
            response.setCharacterEncoding("UTF-8");
            try (Writer writer = response.getWriter()) {
                writer.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
       public String buildPlaceForm(Destination destination){
        String html=String.format("<div class=\"col-md-6\">\n" +
                "<div class='contact_form'>\n" +
                "<form method='post' action='updateplace' enctype='multipart/form-data'>\n" +
                "\n" +
                "<input class='nuber'' type='text' name='place' value='%s'>" +
                "\n" +
                "<input  class='name' type='text'  style='width:540px; height:144px;'  name='describe' value='%s' ><br>\n" +
                "<input   class='nuber' type=\"file\"  name=\"img\" value=\"上传图片\"><br>\n" +
                "\n" +
                "<button type=\"clear\" class=\"btn btn-info mrgn-can\">Clear</button>\n" +
                "<button type=\"submit\" class=\"btn btn-info mrgn-can\">Submit</button>\n" +
                "</form>\n" +
                "</div>\n" +
                "</div>",destination.getPlace(),destination.getDescribe());
           return html;
    }

}
