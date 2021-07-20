
package Servlet;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Juego;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.util.Length;


@WebServlet(name = "CrearJuego", urlPatterns = {"/CrearJuego"})
public class CrearJuego extends HttpServlet {

    
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
        
        String nombre = request.getParameter("nombre");
        int capacidad = Integer.parseInt(request.getParameter("capacidad"));
    
        String horario = request.getParameter("horario");
        
        String responsable = request.getParameter("responsable");
        
        
        Juego juego = new Juego();
        //metodo para obtener el responsable
        Controladora control = new Controladora();
        
        

        //----------------------------------------------------------
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("capacidad", capacidad);
        request.getSession().setAttribute("horario", horario);
        //----------------------------------------------------------------
        List<Empleado> lisemp = control.ListaEmpleados();
        List<Empleado> emple = new ArrayList();
        for(Empleado emp : lisemp){
                if (emp.getNombre().equals(responsable)){
                    emple.add(emp);
                            } 
        }
        //------------------------------------------------------------
        juego.setNombre(nombre);
        juego.setCapacidad(capacidad);
        juego.setHorario(horario);
        
        juego.setEmp(emple);
        
        
        control.CrearJuego(juego);
        response.sendRedirect("Confirm/AltaRealizada.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean Length(List<Empleado> lisemp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}