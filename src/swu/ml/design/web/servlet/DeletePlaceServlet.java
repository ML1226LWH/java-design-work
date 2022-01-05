package swu.ml.design.web.servlet;

import swu.ml.design.service.DestinationService;
import swu.ml.design.service.DestinationServiceImpl;
import swu.ml.design.utils.DBUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/deleteplace")
public class DeletePlaceServlet extends HttpServlet {
    private static final long serialVersionUID=1824629527973895L;
    private DestinationService destinationService = new DestinationServiceImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        System.out.println("id=" + id);
        try {
            destinationService.deletePlace(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("refresh", "1;url=/MyNewApp/admin/gallery_root.jsp");

    }
}
