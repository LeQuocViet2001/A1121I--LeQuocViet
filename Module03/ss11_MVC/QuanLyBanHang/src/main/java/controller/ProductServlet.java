package controller;

import model.bean.Product;
import model.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    ProductService productService = new ProductService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("state");
        if (state == null){
            state ="";
        }
        switch (state){
            case "edit":{
                updateProduct(request,response);
                response.sendRedirect("/home");
                break;}
            case "delete":{
                break;}
            case "add":{
                addProduct(request,response);
                response.sendRedirect("/home");
                break;}

    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("state");
        if (state == null){
            state ="";
        }
        switch (state){
            case "edit":{
//                response.sendRedirect("/hocsinh?state=add");
                showFormEdit(request,response);
                response.sendRedirect("/home");
                break;}
            case "add":{
                showFormAdd(request,response);
                response.sendRedirect("/home");
                break;}
            case "delete":{
                deleteProduct(request,response);
                response.sendRedirect("/home");
                break;}

            default: {
                {

                }
            }


        }

    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/addProduct.jsp");

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        String state = request.getParameter("id");
        int id = Integer.parseInt(state.trim());
        Product product = productService.getProduct(id);

        request.setAttribute("product",  product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/editProduct.jsp");

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        String state = request.getParameter("id");
        int id = Integer.parseInt(state.trim());
        productService.delete(id);


    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(  request.getParameter("id").trim() );

        String ten = request.getParameter("ten");
        double price = Double.parseDouble(  request.getParameter("price").trim() );
        String mota = request.getParameter("mota");
        String origin = request.getParameter("origin");

        productService.editProduct( id, ten, price, mota,  origin  );
    }


    private void addProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(  request.getParameter("id").trim() );
        String ten = request.getParameter("ten");
        double price = Double.parseDouble(  request.getParameter("price").trim() );
        String mota = request.getParameter("mota");
        String origin = request.getParameter("origin");
        System.out.println(ten + price + origin);
        System.out.println(ten + price + origin);
        System.out.println(ten + price + origin); System.out.println(ten + price + origin);


        productService.addProduct( id, ten, price,mota,  origin  );
    }
}


