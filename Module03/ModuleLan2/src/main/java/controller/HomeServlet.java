package controller;

import model.Category;
import model.SanPham;
import service.SanPhamService;
import service.SanPhamServiceImpl;

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

    private SanPhamServiceImpl sanPhamService = new SanPhamService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action==null)
            action ="";
        switch (action) {
            case "add": {
                addSanPham(request,response);
                response.sendRedirect("/home");
                break;
            }
            case "edit": {
                editSanPham(request,response);
                response.sendRedirect("/home");
                break;
            }
            case "delete":{
                int id =  Integer.parseInt(request.getParameter("idDelete")  );
                sanPhamService.delSanPham(id);
                response.sendRedirect("/home");
                break;
            }
            case "search":{
                searchSanPham(request,response);
                break;
            }
        }
    }

    private void editSanPham(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        double gia = Double.parseDouble(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));

        String mau = request.getParameter("mau");
        String moTa = request.getParameter("moTa");
        int idMuc = Integer.parseInt(request.getParameter("idMuc"));

        SanPham sanPham = new SanPham(id,ten,soLuong,gia,mau,moTa,idMuc);

        sanPhamService.editSanPham(sanPham);


    }

    private void searchSanPham(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");

        List<SanPham> sanPhamList = sanPhamService.getListSearch(searchName);
        request.setAttribute("sanPhamList",sanPhamList  );

        List<Category> categoryList = sanPhamService.getAllListDanhMuc();
        request.setAttribute("categoryList",categoryList  );

        request.setAttribute("Name",searchName  );

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/homeSanPham.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    private void addSanPham(HttpServletRequest request, HttpServletResponse response) {

        String ten = request.getParameter("ten");
        double gia = Double.parseDouble(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));

        String mau = request.getParameter("mau");
        String moTa = request.getParameter("moTa");

       int idMuc = Integer.parseInt(request.getParameter("idMuc"));

       SanPham sanPham = new SanPham(0, ten,soLuong,gia,mau,moTa, idMuc);
       sanPhamService.addSanPham(sanPham);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action==null)
            action ="";
        switch (action) {
            case "add": {
                showFormAdd(request,response);
                break;
            }
            case "edit":{
                showFormEdit(request,response);
                break;

            }
            default:{

                showListHome(request,response);
                break;
            }
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt( request.getParameter("id"));
        SanPham sanPham = sanPhamService.getSanPham(id);

        List<Category> categoryList = sanPhamService.getAllListDanhMuc();
        request.setAttribute("categoryList",categoryList  );

        request.setAttribute("sanPham", sanPham );
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/formEdit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showListHome(HttpServletRequest request, HttpServletResponse response) {
        List<SanPham> sanPhamList = sanPhamService.getAllListSanPham();
        request.setAttribute("sanPhamList",sanPhamList  );

        List<Category> categoryList = sanPhamService.getAllListDanhMuc();
        request.setAttribute("categoryList",categoryList  );

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/homeSanPham.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = sanPhamService.getAllListDanhMuc();
        request.setAttribute("categoryList",categoryList  );

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/formAdd.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
