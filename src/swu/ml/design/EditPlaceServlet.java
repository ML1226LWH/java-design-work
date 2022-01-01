package swu.ml.design;

import com.alibaba.fastjson.JSON;
import swu.ml.design.utils.DBUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/editplace")
public class EditPlaceServlet extends HttpServlet {
    private static final long serialVersionUID=763921866686380L;

    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        response.setContentType("application/json;charset=UTF-8");
        System.out.println("id=" + id);
        String sql = "SELECT * FROM destination WHERE id=" + id;

        List<Destination> destinations = null;
        try {
            destinations = DBUtils.getDestinations(sql);

            if (destinations.size() == 0) {
                response.sendRedirect("./gallery_root.html");
            }
            Destination destination = destinations.get(0);

            String pageJson = JSON.toJSONString(destination);
            System.out.println(pageJson);
            response.getWriter().write(pageJson);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
