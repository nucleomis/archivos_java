package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormularioBuscarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Buscar Empleado</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"cod-container\">\n");
      out.write("        <div class=\"form-header\">\n");
      out.write("            <img src=\"img/Logo.png\" alt=\"Logo de CodigoMasters\">\n");
      out.write("            <h1>Busqueda<span> por nombre</span></h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <form action=\"BuscarEmpleado.jsp\" method=\"POST\" id=\"b\" class=\"cod-form\">\n");
      out.write("                <div class=\"form-title\">\n");
      out.write("                    <h3>Rellenar</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-input\" name=\"nombre\" id=\"nombre\" required>\n");
      out.write("                    <label class=\"label\" for=\"nombre\">Nombre</label>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"submit\" class=\"form-input\" value=\"Buscar\" id=\"bt\">\n");
      out.write("                    <p><a href=\"PanelEmpleado.jsp\" class=\"alt-form\">Volver</a></p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/form.js\"></script>\n");
      out.write("</body>\n");
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
