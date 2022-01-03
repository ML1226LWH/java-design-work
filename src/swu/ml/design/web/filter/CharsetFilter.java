package swu.ml.design.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharsetFilter extends HttpFilter {

    private static final long serialVersionUID = -2840770222442338931L;

    public void doFilter(HttpServletRequest request,
                         HttpServletResponse response, FilterChain chain)
            throws java.io.IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);
    }
    public void destroy(){}
}
