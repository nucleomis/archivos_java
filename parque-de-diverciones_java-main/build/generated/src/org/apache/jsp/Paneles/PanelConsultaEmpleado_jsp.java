package org.apache.jsp.Paneles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PanelConsultaEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Panel de Empleado</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/TpfinalApweb/css/estilos.css\">\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cod-container\">\n");
      out.write("            <div class=\"form-header\">\n");
      out.write("            <h1>Opciones<span> de Lista</span></h1>\n");
      out.write("            </div>\n");
      out.write("            <h2>\n");
      out.write("                <li><a href=\"/TpfinalApweb/Formularios/FormularioBuscarEmpleado.jsp\" class=\"alt-form\">Buscar empleado</a></li>\n");
      out.write("                <li><a href=\"/TpfinalApweb/PagListaEmpleados.jsp\" class=\"alt-form\">Lista de Empleados</a></li>\n");
      out.write("            </h2>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <p><a href=\"/TpfinalApweb/Paneles/PanelEmpleado.jsp\" class=\"alt-form\">Atras</a></p>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <p><a href=\"/TpfinalApweb/PanelPrincipal.jsp\" class=\"alt-form\">volver al panel</a></p>\n");
      out.write("           <p><a href=\"#\" class=\"alt-form\">Cerrar Sesion</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
