/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    
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
        
        
        String user = request.getParameter("form-input");
        String pass = request.getParameter("form-pass");
        
        request.getSession().setAttribute("orm-input", user);
        request.getSession().setAttribute("form-pass", pass);
        
        List <Usuario> listauser = control.ListarUsuarios();
        
        boolean confirm = false;
        
        for (Usuario us : listauser){
            if (us.getNom_usuario().equals(user) && us.getPass().equals(pass)){
                confirm = true;
            }
        }
        
        if (confirm == true){
            HttpSession misesion = request.getSession(true);
            
            misesion.setAttribute("usuario", user);
            misesion.setAttribute("pass", pass);
            
            response.sendRedirect("PanelPrincipal.jsp");
            
        }
        else{
            response.sendRedirect("ErrorLogin.jsp");
        }
    }   

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
