/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.apresentacao.servlets;

import br.edu.ifpe.fachada.Fachada;
import br.edu.ifpe.negocio.Personagem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 1860915
 */
@WebServlet(name = "VisualizaPersonagemServlet", urlPatterns = {"/VisualizaPersonagemServlet"})
public class VisualizaPersonagemServlet extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        
        int indice = Integer.parseInt(request.getParameter("indice"));
        
        Personagem personagem = ((List<Personagem>)session.getAttribute("personagens")).get(indice);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VisualizaPersonagemServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Meu personagem</h1>");
            out.println("<a href='ApresentaPersonagensServlet'>apresentar personagens</a><br/>");
            out.println("Nome: "+personagem.getNome()+"<br/>");
            out.println("Idade: "+personagem.getIdade()+"<br/>");
            out.println("Habilidades: "+personagem.getHabilidades()+"<br/>");
            out.println("Ideologia: "+personagem.getIdeologia()+"<br/>");
            out.println("Armas: "+personagem.getArmas()+"<br/>");
            out.println("Armaduras: "+personagem.getArmadura()+"<br/>");
            out.println("Sexo: "+personagem.getSexo()+"<br/>");
            out.println("Importância: "+personagem.getImportancia()+"<br/>");
            out.println("História: "+personagem.getHistoria()+"<br/>");
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
