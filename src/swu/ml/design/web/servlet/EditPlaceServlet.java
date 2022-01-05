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

@WebServlet("/editplace")
public class EditPlaceServlet extends HttpServlet {
    private static final long serialVersionUID=763921866686380L;
    private DestinationService destinationService = new DestinationServiceImpl();
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
            String id=request.getParameter("id");
        Destination destination= null;
        try {
            destination = destinationService.selectDestination(Integer.valueOf(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
            request.setAttribute("destination",destination);
            System.out.println("destination.id="+destination.getId()+"  destination.place="+destination.getPlace());
            request.getRequestDispatcher("/admin/EditPlace.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

}

