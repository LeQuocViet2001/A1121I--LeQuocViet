package controller;

import model.bean.User;
import model.service.ILogin;
import model.service.impl.LoginService;
import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.List;


@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class loginServlet extends HttpServlet {

    private ILogin iLoginService = new LoginService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String cookie = request.getParameter("cookie");

        User userCheck = new User(username,password);
        User user = iLoginService.checkExits(userCheck);

            if( cookie != null) {
                Cookie c = new Cookie("username", username);
                Cookie p = new Cookie("password", password);
                c.setMaxAge(60);
                p.setMaxAge(60);
                response.addCookie(c);
                response.addCookie(p);
                System.out.println(cookie);
            }

        if(  user == null){
            request.setAttribute("msg", "Dang Nhap Khong Thanh Cong");
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/login.jsp");
            dispatcher.forward(request,response);
        }else{


            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/homeWeb.jsp");
            dispatcher.forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action == null)
            action ="";
        switch ( action) {
            case "logout": {
                HttpSession session = request.getSession();
                session.invalidate();
                RequestDispatcher dispatcher = request.getRequestDispatcher("view/home.jsp");
                dispatcher.forward(request, response);
                break;
            }
            default:{
                Cookie ck[] = request.getCookies();
                for ( Cookie o: ck) {
                    if(  o.getName().equals("username"))
                        request.setAttribute("username",o.getValue() );
                    if(  o.getName().equals("password"))
                        request.setAttribute("password",o.getValue() );
                }

                RequestDispatcher dispatcher = request.getRequestDispatcher("view/login.jsp");
                dispatcher.forward(request,response);
            }
        }
    }
}
