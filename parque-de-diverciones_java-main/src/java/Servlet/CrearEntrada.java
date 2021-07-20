
package Servlet;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Entrada;
import Logica.Juego;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CrearEntrada", urlPatterns = {"/CrearEntrada"})
public class CrearEntrada extends HttpServlet {


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
        
        String cliente = request.getParameter("cliente");
        String juego = request.getParameter("juego");
        String fecha = (String) request.getParameter("fecha");
        String horario = (String) request.getParameter("horario");
        
        request.getSession().setAttribute("cliente", cliente);
        request.getSession().setAttribute("juego", juego);
        request.getSession().setAttribute("fecha", fecha);
        request.getSession().setAttribute("horario", horario);
        
        Controladora control = new Controladora();
        List <Cliente> listacliente = control.ListaCliente();
        List<Juego> listajuegos = control.ListaJuegos();
        List<Entrada> listaentradas = control.ListaEntrada();
        Entrada ent = new Entrada();
        Cliente client = new Cliente();
        
        for(Cliente cli:listacliente){
            if (cli.getNombre().equals(cliente) ){
                client = cli;
            }
        }
        
        boolean seguir = true ;
        
        for(Entrada tiquet:listaentradas){
            if(tiquet.getFecha_emision().equals(fecha) && tiquet.getNom_cliente().equals("cliente")){
                seguir = false;
            } 
        }
        Juego game = new Juego();
        for (Juego ju:listajuegos){
            if (ju.getNombre().equals(juego)){
                game = control.TraerJuego(ju.getId_juego());
            }
        }
        Juego j = control.TraerJuego(1);
        if (seguir==true){
            ent.setNom_cliente(cliente);
            ent.setEdad_cliente(client.getEdad());
            ent.setFecha_emision(fecha);
            ent.setHora(horario);
            ent.setJuego(game);
           
            
            
            control.CrearEntrada(ent);
            
            response.sendRedirect("/TpfinalApweb/Confirm/confirmacion.jsp");
        }
         
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
