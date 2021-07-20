<%@page import="java.util.ArrayList"%>
<%@page import="Logica.Juego"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Empleado"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Panel de Clientes</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
    <body>
        <div class="cod-container">
            <div class="form-header">
            <h1>lista <span> empleados</span></h1>
            </div>
            
            <div class="form-content">
                
                <div class="form-title">
                    <h3>
                        <%
                            Controladora control = new Controladora();
                        String nombre = request.getParameter("juego");

                        List <Juego> g = control.ListaJuegos();
                                for (Juego e : g){
                                    if (e.getNombre().equals(nombre)){
                                        out.println("JUEGO: "+e.getNombre()+"<br>");

                                        for (Empleado em:e.getEmp()){
                                            out.println("<br>");
                                            out.println("Nombre: "+em.getNombre()+"<br>");
                                            out.println("Apellido: "+em.getApellido()+"<br>");
                                            out.println("------------------------------------<br>");
                                        }

                                    }
                                }
                        
                        %>
                    </h3>
                </div>
            </div>
        <div class="input-group">
            <p><a href="Paneles/PanelConsultaJuegos.jsp" class="alt-form">Atras</a></p>
           
        </div>
        <div class="input-group">
            <p><a href="PanelPrincipal.jsp" class="alt-form">volver al panel</a></p>
        </div>
    </body>
</html>