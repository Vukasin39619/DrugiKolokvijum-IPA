/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servleti;

import Beans.Karakteristika;
import Beans.Labrador;
import Beans.bojaDlake;
import Beans.bojaOka;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Vukisha
 */
public class ServletLabrador extends HttpServlet {

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
            out.println("<title>Servlet ServletLabrador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLabrador at " + request.getContextPath() + "</h1>");
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

        Labrador labrador = new Labrador();

        labrador.setGodine(10);
        labrador.setRasa("Labrador");
        labrador.setVrsta("Lovacki pas");

        Karakteristika karak = new Karakteristika();

        karak.setDuzinaDlake("Kratka");
        karak.setVelicina("Velik");

        bojaOka bo = new bojaOka();
        bojaOka bo2 = new bojaOka();
        bojaDlake bd = new bojaDlake();
        bojaDlake bd2 = new bojaDlake();
        bojaDlake bd3 = new bojaDlake();

        bo.setBojaOka("Braon");
        bo2.setBojaOka("Crna");

        bd.setBojaDlake("braon");
        bd2.setBojaDlake("zlatna");
        bd3.setBojaDlake("bela");
        
        ArrayList<String> dlake = new ArrayList<>();
        ArrayList<String> oci = new ArrayList<>();
        
        dlake.add(bd.getBojaDlake());
        dlake.add(bd2.getBojaDlake());
        dlake.add(bd3.getBojaDlake());

        oci.add(bo.getBojaOka());
        oci.add(bo2.getBojaOka());
        
        karak.setBojaDlake(dlake);
        karak.setBojaOka(oci);
        
        labrador.setKarakteristika(karak);
        
        HttpSession sesija = request.getSession();
        sesija.setAttribute("labrador", labrador);
        
        response.sendRedirect("ServletFrancuskiBuldog");
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
