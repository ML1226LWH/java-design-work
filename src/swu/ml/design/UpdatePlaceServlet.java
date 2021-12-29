package swu.ml.design;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/updateplace")
public class UpdatePlaceServlet extends HttpServlet {
    private static final long serialVersionUID = 1743051812167088094L;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String place=request.getParameter("place");
        System.out.println("updatePlace place="+place);
        String describe=request.getParameter("describe");
        String img=request.getParameter("img");
        String id=request.getParameter("id");
        String sql = String.format("UPDATE `destination` SET " +
                        "`place`=\"%s\", `img`=\"%s\", `describe`=%s" +
                        " WHERE `id`=%s",
                place, img, describe, id);

        System.out.println(sql);

        try {
            DBUtils.update(sql);
            response.sendRedirect("/MyNewApp/admin/gallery_root.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
