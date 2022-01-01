package swu.ml.design.count;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionOnlineListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        //1.获取session
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        //2.获取counnt值，加1
        int count = (int) servletContext.getAttribute("count");
        count++;
        //3.把servlet存储到servletContext对象中
        servletContext.setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

        //1.获取session
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        //2.获取counnt值，减1
        int count = (int) servletContext.getAttribute("count");
        count--;
        //3.把servlet存储到servletContext对象中
        servletContext.setAttribute("count",count);
    }

}
