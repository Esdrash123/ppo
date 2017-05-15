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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1860915
 */
@WebServlet(name = "AlteraPersonagemFase1Servlet", urlPatterns = {"/AlteraPersonagemFase1Servlet"})
public class AlteraPersonagemFase1Servlet extends HttpServlet {

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
        
        String nome = request.getParameter("nome");
        
        Personagem personagem = Fachada.getInstance().recuperarPersonagem(nome);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraPersonagemFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Personagem</h1>");
            out.println("<form method='post' action='AlteraPersonagemFase2Servlet'>");
            out.println("Nome:"+personagem.getNome()+"<input type=\"hidden\" name=\"nome\" value='"+personagem.getNome()+"'/><br/>\n" +
"            Idade:<input type=\"text\" name=\"idade\" value='"+personagem.getIdade()+"'/><br/>\n" +
"            Habilidade:<input type=\"text\" name=\"habilidade\" value='"+personagem.getHabilidades()+"'/><br/>\n" +
"            Ideologia:<input type=\"text\" name=\"ideologia\" value='"+personagem.getIdeologia()+"'/><br/>\n" +
"            Armas:<input type=\"text\" name=\"armas\" value='"+personagem.getArmas()+"'/><br/>\n" +
"            Armaduras:<input type=\"text\" name=\"armaduras\" value='"+personagem.getArmadura()+"'/><br/>\n" +
"            Sexo:<input type=\"text\" name=\"sexo\" value='"+personagem.getSexo()+"'/><br/>\n" +
"            Importancia:<input type=\"text\" name=\"importancia\" value='"+personagem.getImportancia()+"'/><br/>\n" +
"            Historia:<textarea name=\"historia\">"+personagem.getHistoria()+"</textarea><br/>\n" +
"            <input type=\"submit\" value=\"alterar\"/>");
            out.println("</form>");
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
