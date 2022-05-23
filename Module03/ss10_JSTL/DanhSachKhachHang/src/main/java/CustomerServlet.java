import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    public static List<Customer> customerList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customerList.add(new Customer("D", "2022/08/20", "Da Nang", "https://www.newshub.co.nz/home/lifestyle/2019/11/dog-years-are-a-myth-2-year-old-dogs-already-middle-aged-scientists/_jcr_content/par/video/image.dynimg.1280.q75.jpg/v1574572358818/GETTY-labrador-puppy-1120.jpg"));
        customerList.add(new Customer("D", "2022/08/20", "Da Nang", "https://th.bing.com/th/id/OIP.HyypY-MslEAKSaYgNh3J_gHaKt?pid=ImgDet&rs=1"));

        customerList.add(new Customer("D", "2022/08/20", "Da Nang", "https://pbs.twimg.com/media/CKne3q0WEAALSQk.jpg:large"));

        customerList.add(new Customer("D", "2022/08/20", "Da Nang", "https://th.bing.com/th/id/OIP.hbaEzM-HNBhEnOUNZNvS8AHaJ4?pid=ImgDet&rs=1"));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        requestDispatcher.forward(request, response);
    }
}