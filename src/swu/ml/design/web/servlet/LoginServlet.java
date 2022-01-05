package swu.ml.design.web.servlet;

import swu.ml.design.domain.Logs;
import swu.ml.design.service.UsersService;
import swu.ml.design.service.UsersServiceImpl;
import swu.ml.design.web.filter.AuthFilter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1743051812167088094L;
    private UsersService usersService = new UsersServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");

        String users = request.getParameter("users");
        String password = request.getParameter("pwd");
        String code = request.getParameter("code");
        Logs logs = new Logs();
        logs.setUsers(users);
        logs.setPwd(password);
        System.out.println("用户名输入如下：" + users);
        System.out.println("用户名存储如下：" + logs.getUsers());

        HttpSession session = request.getSession(true);
        String validateCode = (String) session.getAttribute(AuthFilter.LOGIN_VALIDATE_CODE);
        request.getSession().setAttribute("LOGIN_STATUS",request.getSession().getId());
        System.out.println("request.getSession().getId():"+request.getSession().getId());
        if (validateCode == null || !validateCode.equalsIgnoreCase(code)) {
            response.sendRedirect("/MyNewApp/tuyang-login.html");
            return;
        }
        try {
            if (usersService.check(logs.getUsers(), logs.getPwd()).equals("登录失败！")) {
                response.sendRedirect("/MyNewApp/tuyang-login.html");
            } else {
                response.sendRedirect("/MyNewApp/admin/gallery_root.jsp");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

}

