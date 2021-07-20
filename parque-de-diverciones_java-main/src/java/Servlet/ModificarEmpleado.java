/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sergio
 */
@WebServlet(name = "ModificarEmpleado", urlPatterns = {"/ModificarEmpleado"})
public class ModificarEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

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
        
        List <Empleado> lisemp = control.ListaEmpleados();
        for(Empleado emp : lisemp){
            if (emp.getNombre().equals(nombre)){
                request.getSession().setAttribute("apellido", apellido);
                request.getSession().setAttribute("dni", dni);
                request.getSession().setAttribute("edad", edad);
                request.getSession().setAttribute("sexo", sexo);
                emp.setNombre(nombre);
                emp.setApellido(apellido);
                emp.setDni(dni);
                emp.setEdad(edad);
                emp.setSexo(sexo);
                control.EditarEmpleado(emp);
            }
           
        }   
       
        response.sendRedirect("ModifEmpleadoRealizada.jsp");
        
        }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
