/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wagner
 */
@WebServlet(name = "WagnerServlet", urlPatterns = {"/wagner"})
public class WagnerServlet extends HttpServlet {

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
            out.println("<title>Wagner de Almeida</title>");
            out.println("<link rel=" + "stylesheet" + " href=" + request.getContextPath() + "/css/styles.css" + ">");
            out.println("</head>");

            out.println("<body>");

            out.println("<header class=" + "container-header" + ">");
            out.println("<h1>Meus dados.</h1>");
            out.println("</header>");

            out.println("<main class=" + "container-main" + ">");

            out.println("<section class=" + "container-padrao" + ">");

            String hour = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
            Integer teste = Integer.parseInt(hour.substring(0, 2));
            String saudacao;
            if (teste >= 00 && teste < 12) {
                saudacao = "Bom dia!";
            } else if (teste >= 12 && teste < 18) {
                saudacao = "Boa tarde!";
            } else {
                saudacao = "Boa noite!";
            }
            
            out.println("<h1 class="+"text-hour"+">" + saudacao + " " + hour +"</h1>");
            out.println("<ul>");
            out.println("<li class=" + "text" + " > Wagner de Almeida </li>");
            out.println("<li class=" + "text" + " > RA:  1290481813036 </li>");
            out.println("<li class=" + "center" + ">");
            out.println("<div class=" + "git" + " >");
            out.println("<img class=" + "svg" + " src=" + "svg/github.svg" + "></img><a href=" + "https://github.com/wagneralm" + ">GitHub.</a>");
            out.println("</div>");
            out.println("</li>");
            out.println("</ul>");
            
            out.println("<div class=" + "btn" + " >");
            out.println("<a href=" + "index.html" + ">Voltar</a>");
            out.println("</div>");

            out.println("</section>");

            out.println("<div class=" + "container-img" + ">");
            out.println("<img src=" + "img/java.png" + " alt=" + "logo-java" + " />");
            out.println("</div>");
            out.println("</main>");

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
        processRequest(request, response);
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
