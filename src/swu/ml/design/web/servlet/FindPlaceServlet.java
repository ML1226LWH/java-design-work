package swu.ml.design.web.servlet;

import swu.ml.design.Destination;
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
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String searchKey = request.getParameter("searchKey");
        List<Destination> destinations = null;
        try {
            destinations = destinationService.listPlaces(searchKey);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("destinations",destinations);
        request.getRequestDispatcher("/gallery_search.jsp").forward(request,response);
    }
}
