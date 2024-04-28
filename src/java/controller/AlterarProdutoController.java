package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Produto;
import model.dao.ProdutoDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author natan
 */
public class AlterarProdutoController extends HttpServlet {

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
        
        String url = "/WEB-INF/jsp/alterar-produto.jsp";
        
        ProdutoDAO daoId = new ProdutoDAO();
        List<Produto> idLista = daoId.listarTodos();
        request.setAttribute("ids", idLista);
        
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
       
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                // Parseia a requisição para obter os itens do formulário
                List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                // Instancia um novo produto
                Produto produto = new Produto();
                // Processa cada item do formulário
                for (FileItem item : items) {
                    // Verifica se o item é um campo de formulário
                    if (item.isFormField()) {
                        // Se sim, verifica o nome do campo e define o valor do produto de acordo
                        switch (item.getFieldName()) {
                            case "id-produto":
                                produto.setIdProduto(Integer.parseInt(item.getString()));
                                break;                                       
                        }
                    } else {
                        // Se não, o item é um arquivo de imagem
                        // Converte o InputStream do arquivo em um array de bytes
                        InputStream inputStream = item.getInputStream();
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                        byte[] imagemBytes = outputStream.toByteArray();
                        // Define a imagem do produto
                        produto.setImagemBytes(imagemBytes);
                        // Fecha os fluxos de entrada e saída
                        inputStream.close();
                        outputStream.close();
                    }
                }
                // Após processar todos os itens do formulário, insere o produto no banco de dados
                ProdutoDAO dao = new ProdutoDAO();
                boolean sucesso = dao.updateImg(produto);
                if (sucesso) {
                    // Se a inserção for bem-sucedida, redireciona para a página de produtos
                    redirectToSuccessPage(request, response);
                } else {
                    // Se ocorrer algum erro, redireciona para a página de erro
                    redirectToErrorPage(request, response);
                }
            } catch (FileUploadException e) {
                throw new ServletException("Cannot parse multipart request.", e);
            }
        } // else if(url)
        
        else {
            // Se a requisição não for multipart, redireciona para a página inicial
            redirectToIndexPage(request, response);
        }   
    }
    
     private void redirectToSuccessPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Redireciona para a página de produtos
        response.sendRedirect(request.getContextPath() + "/alterar-produto");
    }

    private void redirectToErrorPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Redireciona para a página de erro
        response.sendRedirect(request.getContextPath() + "/home");
    }

    private void redirectToIndexPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Redireciona para a página inicial
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
