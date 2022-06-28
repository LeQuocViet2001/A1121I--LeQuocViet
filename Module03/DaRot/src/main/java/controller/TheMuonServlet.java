package controller;

import model.HocSinh;
import model.Sach;
import model.TheMuon;
import service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TheMuonServlet", urlPatterns = "/muon")
public class TheMuonServlet extends HttpServlet {

    private TheMuonServiceImpl theMuonService = new TheMuonService();
    private SachServiceImpl sachService = new SachService();
    private HocSinhServiceImpl hocSinhService = new HocSinhService();

    HttpSession session;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action==null)
            action ="";
        switch (action) {
            case "search": {
                searchTheMuon(request,response);
                break;
            }
            case "tra": {
                traSach(request,response);
                response.sendRedirect("/muon");
                break;
            }

            }
    }

    private void searchTheMuon(HttpServletRequest request, HttpServletResponse response) {
        String searchTacGia = request.getParameter("searchTacGia");
        String searchHocSinh = request.getParameter("searchHocSinh");
        String searchSach = request.getParameter("searchSach");


        List<TheMuon> theMuonList = theMuonService.searchTheMuon(searchHocSinh,searchSach,searchTacGia);
        request.setAttribute("theMuonList", theMuonList);

        List<Sach> sachList = sachService.getAllSach();
        request.setAttribute("sachList", sachList);

        List<HocSinh> hocSinhList = hocSinhService.getListHocSinh();
        request.setAttribute("hocSinhList", hocSinhList);

        request.setAttribute("sTacGia", searchTacGia);
        request.setAttribute("sHocSinh", searchHocSinh);
        request.setAttribute("sSach", searchSach);


        RequestDispatcher dispatcher = request.getRequestDispatcher("view/formThongKe.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void traSach(HttpServletRequest request, HttpServletResponse response) {
        String maMuon = request.getParameter("maMuon");
        int maSach = Integer.parseInt( request.getParameter("maSach"));
        System.out.println(maMuon + "" + maSach);
        session = request.getSession();
        if(    theMuonService.traSach(maMuon, maSach) == true) {
            session.setAttribute("msgSucces"," tra thanh cong");
        }
        else{
            session.setAttribute("msgFail"," tra That bai");

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
            case "delete": {
                int id = Integer.parseInt(request.getParameter("idDelete"));
                break;
            }
            case "tra": {
                showFormTraSach(request,response);
                break;
            }

            default: {

                List<TheMuon> theMuonList = theMuonService.getListAll();
                request.setAttribute("theMuonList", theMuonList);

                List<Sach> sachList = sachService.getAllSach();
                request.setAttribute("sachList", sachList);

                List<HocSinh> hocSinhList = hocSinhService.getListHocSinh();
                request.setAttribute("hocSinhList", hocSinhList);


                RequestDispatcher dispatcher = request.getRequestDispatcher("view/formThongKe.jsp");
                try {
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }}

    private void showFormTraSach(HttpServletRequest request, HttpServletResponse response) {
        String id =  request.getParameter("id");
        TheMuon theMuon = theMuonService.getById(id);
        request.setAttribute("theMuon",theMuon );


        RequestDispatcher dispatcher = request.getRequestDispatcher("view/formTraSach.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
