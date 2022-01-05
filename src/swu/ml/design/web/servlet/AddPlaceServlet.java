package swu.ml.design.web.servlet;

import swu.ml.design.service.DestinationService;
import swu.ml.design.service.DestinationServiceImpl;
import  swu.ml.design.utils.DBUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
@WebServlet("/addPlace")
public class AddPlaceServlet extends HttpServlet {
    private static final long serialVersionUID = 1139723442711986380L;
    private DestinationService destinationService = new DestinationServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String place = request.getParameter("place");
        String describe = request.getParameter("describe");
        try {
            destinationService.addPlace(request);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!ServletFileUpload.isMultipartContent(request)) {
            // 如果不是则停止
            PrintWriter writer = null;
            writer = response.getWriter();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            return;
        }
            response.sendRedirect("admin/gallery_root.jsp");

    }

}