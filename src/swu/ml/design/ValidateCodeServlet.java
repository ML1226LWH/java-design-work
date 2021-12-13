package swu.ml.design;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

public class ValidateCodeServlet extends HttpServlet {
    private static final long serialVersionUID= -7492822205471471700L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        //System.out.println("111");
        swu.ml.design.ValidateCode coder = new swu.ml.design.ValidateCode();
        session.setAttribute(AuthFilter.LOGIN_VALIDATE_CODE, coder.getCodeString());
        //System.out.println("222");
        response.setContentType("image/jpg");
        //if(coder.getCodeString().equals(request.getParameter()))
        try (OutputStream output = response.getOutputStream()) {
            coder.outputCodeImage(output);
        }
    }
}
