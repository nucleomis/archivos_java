package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PanelPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Panel de control</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        ");

        HttpSession misesion = request.getSession();
        String usu =(String)request.getSession().getAttribute("usuario");
        
        if (usu == null){
            response.sendRedirect("Login.jsp");
        }
        else{
            
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"cod-container\">\n");
      out.write("            <div class=\"form-header\">\n");
      out.write("                <img src=\"img/Logo.png\" alt=\"Logo de CodigoMasters\">\n");
      out.write("                <h1>Panel<span> principal</span></h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-title\">\n");
      out.write("            <h2>\n");
      out.write("                <a href=\"Paneles/PanelEmpleado.jsp\" class=\"alt-form\">Empleados</a>\n");
      out.write("            </h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-title\">\n");
      out.write("            <h2>    \n");
      out.write("                <a href=\"Paneles/PanelDeJuegos.jsp\" class=\"alt-form\">Juegos</a>\n");
      out.write("            </h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-title\">\n");
      out.write("            <h2>\n");
      out.write("                <a href=\"Paneles/PanelClientes.jsp\" class=\"alt-form\">Clientes</a>\n");
      out.write("            </h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-title\">\n");
      out.write("            <h2>\n");
      out.write("                <a href=\"Paneles/PanelEntradas.jsp\" class=\"alt-form\">Entradas</a>\n");
      out.write("            </h2>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <form action=\"/TpfinalApweb/Cerrarsesion\" method=\"POST\" id=\"b\" class=\"cod-form\">\n");
      out.write("                <input type=\"submit\" value=\"Cerrar sesion\"></a></p>\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
      out.write("            \n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/form.js\"></script>\n");
      out.write("        ");

            }
        
      out.write("\n");
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
