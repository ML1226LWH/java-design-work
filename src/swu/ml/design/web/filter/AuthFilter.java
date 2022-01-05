package swu.ml.design.web.filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthFilter extends HttpFilter {
    public final static String LOGIN_STATUS = null;
    public final static String LOGIN_VALIDATE_CODE = "LOGIN_VALIDATE_CODE";

    private static final long serialVersionUID = -2840770222932338931L;


    public void doFilter(HttpServletRequest request,
                         HttpServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {

        Object LOGIN_STATUS = request.getSession().getAttribute("LOGIN_STATUS");
        System.out.println("LOGIN_STATUS"+LOGIN_STATUS);
        if (LOGIN_STATUS == null) {
            response.sendRedirect("/MyNewApp/tuyang-login.html");
        } else {
            chain.doFilter(request, response);
        }
    }
    public void destroy(){}
}
