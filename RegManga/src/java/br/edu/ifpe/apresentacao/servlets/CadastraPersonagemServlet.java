/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.apresentacao.servlets;

import br.edu.ifpe.fachada.Fachada;
import br.edu.ifpe.negocio.Personagem;
import br.edu.ifpe.negocio.builders.BuilderPersonagem;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CadastraPersonagemServlet", urlPatterns = {"/CadastraPersonagemServlet"})
public class CadastraPersonagemServlet extends HttpServlet {

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
        int idade = Integer.parseInt(request.getParameter("idade"));
        String habilidade = request.getParameter("habilidade");
        String armas = request.getParameter("armas");
        String armaduras = request.getParameter("armaduras");
        String historia = request.getParameter("historia");
        String ideologia = request.getParameter("ideologia");
        String sexo = request.getParameter("sexo");
        String importancia = request.getParameter("importancia");
        
        BuilderPersonagem bPersonagem = new BuilderPersonagem(nome, habilidade, importancia);
        bPersonagem.setArmadura(armaduras);
        bPersonagem.setArmas(armas);
        bPersonagem.setHistoria(historia);
        bPersonagem.setIdade(idade);
        bPersonagem.setIdeologia(ideologia);
        bPersonagem.setSexo(sexo);
        
        Personagem personagem = bPersonagem.buildPersonagem();
        
        Fachada.getInstance().inserir(personagem);
        
        HttpSession session = request.getSession();
        
        session.setAttribute("msg","Personagem Cadastrado com sucesso!");
        
        response.sendRedirect("ApresentaPersonagensServlet");
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
