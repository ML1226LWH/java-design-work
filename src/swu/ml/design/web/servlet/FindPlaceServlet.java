package swu.ml.design.web.servlet;

import swu.ml.design.domain.Destination;
import swu.ml.design.service.DestinationService;
import swu.ml.design.service.DestinationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/findplace")
public class FindPlaceServlet extends HttpServlet {
    private DestinationService destinationService = new DestinationServiceImpl();
    private static final long serialVersionUID= -5802402997776180444L;
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String searchKey=request.getParameter("searchKey");
        List<Destination> destinations= null;
        try {
            destinations = destinationService.listPlaces(searchKey);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("destinations",destinations);
        request.getRequestDispatcher("/admin/gallery_search.jsp").forward(request,response);
    }
}

