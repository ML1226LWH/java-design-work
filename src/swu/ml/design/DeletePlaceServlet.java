package swu.ml.design;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteplace")
public class DeletePlaceServlet extends HttpServlet {
    private static final long serialVersionUID=1824629527973895L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        System.out.println("id=" + id);
        String sql = "DELETE FROM destination WHERE id=" + id;
        response.sendRedirect("gallery_root.jsp");
    }
}
