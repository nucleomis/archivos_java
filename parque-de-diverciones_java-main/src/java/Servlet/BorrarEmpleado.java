
package Servlet;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "BorrarEmpleado", urlPatterns = {"/BorrarEmpleado"})
public class BorrarEmpleado extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List <Empleado> emp = new ArrayList();
        
        Controladora control = new Controladora();
        
        emp = control.ListaEmpleados();
        
        String nombre = request.getParameter("nombre");
        request.getSession().setAttribute("nombre", nombre);
        
        List <Usuario> user = control.ListarUsuarios();
            for (Usuario us : user){
                if (us.getEmpl().getNombre().equals(nombre)){
                    control.BorrarUsuario(us.getId_usuario());
                }
            }
            
        boolean ok = false;
        for (Empleado em : emp){
            if (em.getNombre().equals(nombre)){
                int id = em.getId_empleado();
                
                control.BorrarEmpleado(id);
                ok=true;
            }
        }
        
        if (ok == true){
            response.sendRedirect("Confirm/BorradoRealizado.jsp");
        }
        else{
           response.sendRedirect("ErrorParametro.jsp"); 
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
