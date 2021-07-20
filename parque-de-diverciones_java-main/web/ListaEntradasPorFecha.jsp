<%@page import="Logica.Entrada"%>
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
            <h1>LISTA DE <span>ENTRADAS </span></h1>
            </div>
            
            <div class="form-content">
                
                <div class="form-title">
                    <h3>
                        <%
                            Controladora control = new Controladora();
                            
                            int cont = 0;
                            String ref = (String)session.getAttribute("fecha");
                            List<Entrada> listaentrada = control.ListaEntrada();
                            
                        for(Entrada tiquet:listaentrada){
                            
                            if(tiquet.getFecha_emision().equals(ref)){
                                out.println("fecha: "+tiquet.getFecha_emision()+"<br>");
                                out.println("cliente: "+tiquet.getNom_cliente()+"<br>");
                                out.println("id: "+tiquet.getId_entrada()+"<br>");
                                out.println("-----------------------------------------<br>");
                                cont++;
                            } 
                        }
                        out.println("Total: "+cont);
                        
                        %>
                    </h3>
                </div>
            </div>
        <div class="input-group">
            <p><a href="Paneles/PanelConsultaEntrada.jsp" class="alt-form">Atras</a></p>
           
        </div>
        <div class="input-group">
            <p><a href="PanelPrincipal.jsp" class="alt-form">volver al panel</a></p>
        </div>
    </body>
</html>
