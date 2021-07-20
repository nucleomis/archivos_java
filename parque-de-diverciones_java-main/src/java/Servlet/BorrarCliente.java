
package Servlet;

import Logica.Cliente;
import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "BorrarCliente", urlPatterns = {"/BorrarCliente"})
public class BorrarCliente extends HttpServlet {

   
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
        
        
        Controladora control = new Controladora();
        
        List <Cliente> cli = control.ListaCliente();
        
        String nombre = request.getParameter("nombre");
        request.getSession().setAttribute("nombre", nombre);
        
        boolean ok = false;
        for (Cliente cl : cli){
            if (cl.getNombre().equals(nombre)){
                int id = cl.getId_ecliente();
                ok = true;
                control.BorrarCliente(id);
                
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
