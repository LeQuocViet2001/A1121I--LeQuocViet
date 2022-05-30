package controller;

import model.bean.Product;
import model.service.IProductService;
import model.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("state");
        if (state == null){
            state ="";
        }
        switch (state){
            case "add":{
                response.sendRedirect("/hocsinh?state=add");
                break;}
            case "edit":{
                // chỉnh sửa
                break;}

            default: {
                {
                    reHome(request, response);
                    break;
                }
            }


        }
    }

    private void reHome(HttpServletRequest request, HttpServletResponse response) {
        ProductService productService = new ProductService();
        List<Product> productList =  productService.getAllProduct();
        request.setAttribute("productList", productList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/home.jsp");

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
