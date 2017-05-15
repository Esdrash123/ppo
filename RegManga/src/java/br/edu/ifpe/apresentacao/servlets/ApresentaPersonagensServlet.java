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
@WebServlet(name = "ApresentaPersonagensServlet", urlPatterns = {"/ApresentaPersonagensServlet"})
public class ApresentaPersonagensServlet extends HttpServlet {

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
        
        List<Personagem> personagens = Fachada.getInstance().recuperarTodosPersonagens();
        
        HttpSession session = request.getSession();
        
        session.setAttribute("personagens", personagens);
        
        String mensagem = (String)session.getAttribute("msg");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ApresentaPersonagensServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Personagens Cadastrados</h1>");
            if(mensagem!=null){
                out.println("<h2>"+mensagem+"t</h2>");
                session.removeAttribute("msg");
            }
            out.println("<a href='index.html'>home</a><br/>");
            out.println("<table border='1'>");
            out.println("<tr><th>Nome</th><th>Idade</th><th>Importância</th><th>Habilidades</th><th>Operações</th></tr>");
            for(Personagem p:personagens){
                out.println("<tr>");
                 out.println("<td>"+p.getNome()+"</td>");
                 out.println("<td>"+p.getIdade()+"</td>");
                 out.println("<td>"+p.getImportancia()+"</td>");
                 out.println("<td>"+p.getHabilidades()+"</td>");
                 out.println("<td><a href='VisualizaPersonagemServlet?indice="+personagens.indexOf(p)+"'>visualizar</a> "
                         + "<a href='AlteraPersonagemFase1Servlet?nome="+p.getNome()+"'>alterar</a> "
                         + "<a href='ExcluiPersonagemServlet?nome="+p.getNome()+"'>excluir</a></td>");
                out.println("</tr>");
            }
            out.println("</table>");
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
