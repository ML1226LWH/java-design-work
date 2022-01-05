package swu.ml.design.web.servlet;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import swu.ml.design.service.DestinationService;
import swu.ml.design.service.DestinationServiceImpl;
import swu.ml.design.utils.DBUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/updateplace")
public class UpdatePlaceServlet extends HttpServlet {
    private static final long serialVersionUID = 1743051812167088094L;
    private DestinationService destinationService = new DestinationServiceImpl();
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String place=request.getParameter("place");
        System.out.println("updatePlace place="+place);
        String describe=request.getParameter("describe");
        String img=request.getParameter("img");

        String id=request.getParameter("id");
        try {
            destinationService.updatePlace(id,request);
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
        response.setCharacterEncoding("UTF-8");
        response.sendRedirect("/MyNewApp/admin/gallery_root.jsp");
    }

}
