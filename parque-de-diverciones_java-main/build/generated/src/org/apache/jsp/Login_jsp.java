package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Form Login and Register</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"cod-container\">\n");
      out.write("        <div class=\"form-header\">\n");
      out.write("            <img src=\"img/Logo.png\" alt=\"Logo de CodigoMasters\">\n");
      out.write("            <h1>Codigo<span>Masters</span></h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <form action=\"ServletLogin\" class=\"cod-form\" method=\"POST\">\n");
      out.write("                <div class=\"form-title\">\n");
      out.write("                    <h3>Iniciar Sesión</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-input\" name=\"form-input\" id=\"correo\" required>\n");
      out.write("                    <label class=\"label\" for=\"correo\">Usuario</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-input\" name=\"form-pass\" id=\"pass\" required>\n");
      out.write("                    <label class=\"label\" for=\"pass\">Contraseña</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"submit\" class=\"form-input\" value=\"Iniciar Sesión\">\n");
      out.write("                    <p>No tienes cuenta? <a href=\"#\" class=\"alt-form\">Ingresa aquí</a></p>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <form action=\"#\" class=\"cod-form\">\n");
      out.write("                <div class=\"form-title\">\n");
      out.write("                    <h3>Regístrate Gratis</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-input\" name=\"form-input\" id=\"reg-correo\">\n");
      out.write("                    <label class=\"label\" for=\"reg-correo\">Correo</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-input\" name=\"form-input\" id=\"reg-pass\">\n");
      out.write("                    <label class=\"label\" for=\"reg-pass\">Contraseña</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-input\" name=\"form-input\" id=\"reg-rep-pass\">\n");
      out.write("                    <label class=\"label\" for=\"reg-rep-pass\">Repetir Contraseña</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"submit\" class=\"form-input\" value=\"Registrate\">\n");
      out.write("                    <p>Ya tienes cuenta? <a href=\"#\" class=\"alt-form\">Ingresa aquí</a></p>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/form.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
