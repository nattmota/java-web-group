/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.bean.Categoria;
import model.bean.Produto;
import model.dao.CategoriaDAO;
import model.dao.ProdutoDAO;

/**
 *
 * @author Senai
 */
public class CadastroProdutoController extends HttpServlet {

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
        
        CategoriaDAO dao = new CategoriaDAO();
                 
        List<Categoria> categoria = dao.listarTodos();
        request.setAttribute("categorias", categoria);
        
        ProdutoDAO daoId = new ProdutoDAO();
        List<Produto> idLista = daoId.listarTodos();
        request.setAttribute("ids", idLista);
        
        String url = "/WEB-INF/jsp/cadastro-produto.jsp";
        
        RequestDispatcher d = getServletContext().getRequestDispatcher(url);
        d.forward(request, response);
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
        
        String nomeLivro = request.getParameter("nome-livro");
        String autorLivro = request.getParameter("autor-livro");
        double valor = Double.parseDouble(request.getParameter("valor"));
        String categoria = request.getParameter("categoria");

        InputStream inputStream = null; // Para armazenar a imagem

        try {
            Part filePart = request.getPart("image"); // Obtendo o arquivo da requisição
            if (filePart != null) {
                inputStream = filePart.getInputStream(); // Obtendo o conteúdo da imagem
            } 
        } catch (IOException | ServletException ex) {
            ex.printStackTrace();
            response.sendRedirect("erro.jsp"); // Redireciona para uma página de erro em caso de falha
            return; // Retorna para evitar a execução do restante do código
        }
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
