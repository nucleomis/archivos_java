<%@page import="Logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Empleado"%>
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
            <h1>lista <span> cliente</span></h1>
            </div>
            
            <div class="form-content">
                
                <div class="form-title">
                    <h3>
                        <%
                        String nombre = request.getParameter("nombre");    
                        Controladora control = new Controladora();
                        List <Cliente> emp = control.ListaCliente();
                        request.getSession().setAttribute("nombre", nombre);
                        
                        for (Cliente em :emp){
                            if (em.getNombre().equals(nombre)){
                                out.println("id: "+em.getId_ecliente()+"<br>");
                                out.println("nombre: "+em.getNombre()+"<br>");
                                out.println("Apellido: "+em.getApellido() +"<br>");
                                out.println("Edad: "+em.getEdad()+"<br>");
                                out.println("Sexo: "+em.getSexo()+"<br>");
                                out.println("----------------------------<br>");
                            }
                        }
                        %>
                    </h3>
                </div>
            </div>
        <div class="input-group">
            <p><a href="/TpfinalApweb/Paneles/PanelConsultaCliente.jsp" class="alt-form">Atras</a></p>
           
        </div>
        <div class="input-group">
            <p><a href="PanelPrincipal.jsp" class="alt-form">volver al panel</a></p>
           <p><a href="#" class="alt-form">Cerrar Sesion</a></p>
        </div>
    </body>
</html>