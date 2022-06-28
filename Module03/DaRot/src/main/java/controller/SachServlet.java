package controller;

import model.HocSinh;
import model.Sach;
import model.TheMuon;
import service.HocSinhService;
import service.HocSinhServiceImpl;
import service.SachService;
import service.SachServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SachServlet",urlPatterns = "/sach")
public class SachServlet extends HttpServlet {

    private SachServiceImpl sachService = new SachService();
    private HocSinhServiceImpl hocSinhService = new HocSinhService();
    private HttpSession session;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action==null)
            action ="";
        switch (action) {
            case "add": {
                break;
            }
            case "muon": {
                muonSach(request,response);
                response.sendRedirect("/sach");
                break;
            }
            case "delete":{
                int id =  Integer.parseInt(request.getParameter("idDelete")  );
                response.sendRedirect("/sach");
                break;
            }
            case "search":{
                break;
            }
        }
    }

    private void muonSach(HttpServletRequest request, HttpServletResponse response) {
        String maMuon = request.getParameter("maMuon");
        int maHocSinh = Integer.parseInt(request.getParameter("maHocSinh"));
        int maSach = Integer.parseInt(request.getParameter("maSach"));

        String ngayMuon = request.getParameter("ngayMuon");
        String ngayTra = request.getParameter("ngayTra");

        TheMuon theMuon = new TheMuon(maMuon,maSach, maHocSinh, true, ngayMuon ,ngayTra );


         session = request.getSession();
        if(    sachService.addTheMuon(theMuon) == true) {
            session.setAttribute("msgSucces"," them thanh cong");
        }
        else{
            session.setAttribute("msgFail"," them That bai");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
            if( action==null)
                action ="";
            switch (action) {
                case "add": {
                    break;
                }
                case "muon": {
                    showFormMuonSach(request, response);
                    break;
                }
                case "delete":{
                    int id =  Integer.parseInt(request.getParameter("idDelete")  );
                    break;
                }
                case "search":{
                    break;
                }
                default:{
                    showListSach(request,response);

                    session = request.getSession(false);
                    break;
                }
        }
    }

    private void showListSach(HttpServletRequest request, HttpServletResponse response) {
        List<Sach> sachList = sachService.getAllSach();
        request.setAttribute("sachList",sachList );
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/sachHome.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormMuonSach(HttpServletRequest request, HttpServletResponse response) {
          int idSach = Integer.parseInt( request.getParameter("id"));

          Sach tmp = sachService.getSachById(idSach);
            System.out.println(tmp.toString());

        if(  tmp.getSoLuong() > 0 ){

            Sach sach = sachService.getSachById(idSach);
            request.setAttribute("sach",sach );

            List<HocSinh> hocSinhList = hocSinhService.getListHocSinh();
            request.setAttribute("hocSinhList",  hocSinhList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("view/formMuonSach.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        else{
             session = request.getSession();
            session.setAttribute("msgFail"," Lỗi, Sách này đã cho mượn hết");
            try {
                response.sendRedirect("/sach");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
