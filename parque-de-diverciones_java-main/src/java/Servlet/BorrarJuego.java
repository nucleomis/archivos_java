package Servlet;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Juego;
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


@WebServlet(name = "BorrarJuego", urlPatterns = {"/BorrarJuego"})
public class BorrarJuego extends HttpServlet {


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
        
        List <Juego> juego = control.ListaJuegos();
        
        String nombre = request.getParameter("nombre");
        request.getSession().setAttribute("nombre", nombre);
        
        List <Juego> game = control.ListaJuegos();
            for (Juego ju : game){
                if (ju.getNombre().equals(nombre)){

                    control.BorrarJuego(ju.getId_juego());
                    response.sendRedirect("Confirm/BorradoRealizado.jsp");
                }
            }

        response.sendRedirect("ErrorParametro.jsp");
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}