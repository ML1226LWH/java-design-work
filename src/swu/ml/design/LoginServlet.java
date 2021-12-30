package swu.ml.design;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;


public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1743051812167088094L;


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
        if (validateCode == null || !validateCode.equalsIgnoreCase(code)) {
            response.sendRedirect("/MyNewApp/tuyang-login.html");
            return;
        }
        try {
            if (check(logs.getUsers(), logs.getPwd()).equals("登录失败！")) {
                response.sendRedirect("/MyNewApp/tuyang-login.html");
            } else {
                response.sendRedirect("/MyNewApp/admin/AddPlace.html");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }
    public static String check(String users,String pwd) throws SQLException {
        String sql="SELECT * FROM user_info WHERE users='"+users+"';";
        String pwd_return = DBUtils.getPwd(sql);
        System.out.println("return:"+pwd_return);
        System.out.println("输入："+pwd);
        String examine ;
        System.out.println(pwd_return);
        System.out.println(pwd);
        if(pwd.equals(pwd_return))
        {
            System.out.println("密码核对成功");
            examine="登录成功"+users+"!";
        }
        else{
            System.out.println("密码核对失败");
            examine ="登录失败";
        }
        return examine;

    }
}

