package swu.ml.design.web.servlet;

import com.alibaba.fastjson.JSON;
import swu.ml.design.page.PageResult;
import swu.ml.design.service.DestinationService;
import swu.ml.design.service.DestinationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/listplaces")
public class ListPlacesServlet extends HttpServlet {

    private DestinationService destinationService = new DestinationServiceImpl();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String page = req.getParameter("page");
        if("listPage".equals(page)) {
            listPage(req,resp);
        }
    }

    private void listPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String startPageStr = req.getParameter("startPage");
        String pageSizeStr = req.getParameter("pageSize");
        String searchKey = req.getParameter("searchKey");
        Integer startPage = 1;
        if (startPageStr != null) {
            startPage = Integer.valueOf(startPageStr);
        }
        Integer pageSize = 4;
        if (pageSizeStr != null) {
            pageSize = Integer.valueOf(pageSizeStr);
        }
        PageResult pageResult = destinationService.listPage(startPage, pageSize);
        String pageJson = JSON.toJSONString(pageResult);
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().write(pageJson);
    }
}
