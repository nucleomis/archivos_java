
package Servlet;

import Logica.Controladora;
import Logica.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ModificarCliente", urlPatterns = {"/ModificarCliente"})
public class ModificarCliente extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int dni = Integer.parseInt(request.getParameter("dni"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        String sexo = request.getParameter("sexo");
        
        Controladora control = new Controladora();
        
        request.getSession().setAttribute("nombre", nombre);
        
        List <Cliente> lisemp = control.ListaCliente();
        for(Cliente cli : lisemp){
            if (cli.getNombre().equals(nombre)){
                request.getSession().setAttribute("apellido", apellido);
                request.getSession().setAttribute("dni", dni);
                request.getSession().setAttribute("edad", edad);
                request.getSession().setAttribute("sexo", sexo);
                cli.setNombre(nombre);
                cli.setApellido(apellido);
                cli.setDni(dni);
                cli.setEdad(edad);
                cli.setSexo(sexo);
                control.EditarCliente(cli);
            }
           
        }   
       
        response.sendRedirect("Confirm/confirmacion.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
