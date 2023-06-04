/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servleti;

import Beans.FrancuskiBuldog;
import Beans.Karakteristika;
import Beans.bojaDlake;
import Beans.bojaOka;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;


/**
 *
 * @author Vukisha
 */
public class ServletFrancuskiBuldog extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFrancuskiBuldog</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletFrancuskiBuldog at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        FrancuskiBuldog buldog = new FrancuskiBuldog();
        
        buldog.setGodine(5);
        buldog.setRasa("Francuski Buldog");
        buldog.setVrsta("Kucni pas");
        
        Karakteristika karak = new Karakteristika();
        
        karak.setDuzinaDlake("Kratka");
        karak.setVelicina("Mali");
        
       bojaOka bo = new bojaOka();
       bojaOka bo2 = new bojaOka();
       
       bojaDlake bd = new bojaDlake();
       bojaDlake bd2 = new bojaDlake();
       bojaDlake bd3 = new bojaDlake();
       bojaDlake bd4 = new bojaDlake();
       bojaDlake bd5 = new bojaDlake();
        
       ArrayList<String>dlake = new ArrayList<>();
       ArrayList<String>oci = new ArrayList<>();
        
       bo.setBojaOka("braon");
       bo2.setBojaOka("crna");
       
       bd.setBojaDlake("bela");
       bd2.setBojaDlake("braon");
       bd3.setBojaDlake("siva");
       bd4.setBojaDlake("crno-bela");
       bd5.setBojaDlake("crna");
       
       dlake.add(bd.getBojaDlake());
       dlake.add(bd2.getBojaDlake());
       dlake.add(bd3.getBojaDlake());
       dlake.add(bd4.getBojaDlake());
       dlake.add(bd5.getBojaDlake());
       
       oci.add(bo.getBojaOka());
       oci.add(bo2.getBojaOka());
       
       karak.setBojaDlake(dlake);
       karak.setBojaOka(oci);
       
       buldog.setKarakteristika(karak);
        
       
       
       HttpSession sesija = request.getSession();
       sesija.setAttribute("buldog", buldog);
       
       
       response.sendRedirect("Prikazi.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
