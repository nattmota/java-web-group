package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"style/style-cadastro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/6f0f753ce6.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Usuário</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"cadastro\">\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <h1>Cadastro</h1>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Email\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">                        \n");
      out.write("                        <input type=\"text\" placeholder=\"Usuário\">        \n");
      out.write("                        <i class=\"fa-regular fa-user\"></i>               \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">                        \n");
      out.write("                        <input type=\"text\" placeholder=\"Senha\">\n");
      out.write("                        <i class=\"fa-solid fa-lock\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <input type=\"text\" placeholder=\"CPF\">\n");
      out.write("                        <i class=\"fa-solid fa-key\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Telefone\">\n");
      out.write("                        <i class=\"fa-solid fa-phone\"></i>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"remember-register\">\n");
      out.write("                        <label><input type=\"checkbox\">Lembrar de mim</label>                      \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn\">CADASTRAR</button>\n");
      out.write("\n");
      out.write("                    <div class=\"register-link\">\n");
      out.write("                        <p>Já possui conta? <a href=\"#\">Login</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
