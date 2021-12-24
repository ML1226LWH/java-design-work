/*
package swu.ml.design;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.security.Provider;
import java.sql.SQLException;

public class PageServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        int currentPage = Integer.parseInt(request.getParameter("currentOage"));
        Provider.Service serviceImpl=new ServiceImpl();
        // 调用业务层的功能获取页面模型pageBean
        PageBean<Destination> pageBean;
        try {
            pageBean = serviceImpl.findByCurrentPage(currentPage);
            // 讲这个页面模型存到request里面传到前端
            request.setAttribute("pageBean", pageBean);

            request.getRequestDispatcher("/page_list.jsp");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        this.doGet(request,response);
    }
}
*/
