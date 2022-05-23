import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDiscountServlet", value = "/display-discount")
public class ServletDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int percent = Integer.parseInt(request.getParameter("percent"));



        double discountamount = (price * percent * 0.01);
        double discountprice = price - discountamount;



        request.setAttribute("description", description);
        request.setAttribute("price", price);
        request.setAttribute("percent", percent);
        request.setAttribute("discountAmount", discountamount);
        request.setAttribute("discountPrice", discountprice);


        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}