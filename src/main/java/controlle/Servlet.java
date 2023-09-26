package controlle;

import business.IMPayment;
import business.MPayment;
import model.CreditModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet", urlPatterns = {"*.do"})
public class Servlet extends HttpServlet {
    private MPayment mPayment;
    Integer number = new Random().nextInt();

    @Override
    public void init() throws ServletException {
        super.init();
         mPayment = new IMPayment();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                     request.setAttribute("creditModel",new CreditModel());
        System.out.println(request.getMethod());
                     request.getRequestDispatcher("VueCredit.jsp").forward(request,response);
            /*         System.out.println(request.getQueryString()+" :" + request.getParameter("gender"));
                     System.out.println(request.getRequestURI());
                     System.out.println(request.getRequestURL());
                     System.out.println(request.getPathInfo());
                     System.out.println(request.getServletPath());*/

        System.out.println(number);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        double amount = Double.parseDouble(req.getParameter("amount"));
        int duration  = Integer.parseInt(req.getParameter("duration"));
        double rate   = Double.parseDouble(req.getParameter("rate"));
        double paymentMonthly ;
        paymentMonthly = mPayment.calculatePaymentMonthly(amount,duration,rate);
        CreditModel creditModel = new CreditModel(amount,duration,rate,paymentMonthly);
        req.setAttribute("creditModel",creditModel);
        req.getRequestDispatcher("VueCredit.jsp").forward(req,resp);

        //resp.addCookie(new Cookie("Key","Value"));

        //Cookie[] cookies = req.getCookies();

        Enumeration parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = (String) parameterNames.nextElement();
            System.out.println(parameterName +" and " +req.getParameter(parameterName));
        }
        resp.setStatus(244);
        System.out.println(resp.getStatus());
        System.out.println(req.getQueryString());
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
