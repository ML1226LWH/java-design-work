package swu.ml.design.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
    private static final long serialVersionUID = 2337000991379053090L;
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object LOGIN_STATUS = req.getSession().getAttribute("LOGIN_STATUS");
        if (LOGIN_STATUS!=null){//如果user_session不为空，这说明处于登录状态
            req.getSession().removeAttribute("LOGIN_STATUS");//移除这个数据，sessionID就被移除了
            resp.sendRedirect("index.jsp");//重新回到登录页面
        }
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
