
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
    <title>Panel de Juegos</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
    <body>
        <div class="cod-container">
            <div class="form-header">
            <h1>lista <span> Juegos</span></h1>
            </div>
            
            <div class="form-content">
                
                <div class="form-content">
                    <h3>
                        <%Controladora control = new Controladora();
                        List <Juego> juego = control.ListaJuegos();
                        %>
                        <div class="form-content">
                        <h3>
                        <%for (Juego game : juego){
                            out.println("nombre Juego: "+game.getNombre() +"<br>");
                            out.println("capacidad: "+Integer.toString(game.getCapacidad())+"<br>");
                            out.println("horario: "+game.getHorario()+"<br>");
                            out.println("----------------------------------<br>");
                            out.println("Responsables: <br>");
                            for(Empleado em : game.getEmp()){
                                out.println("nombre: "+em.getNombre()+"<br>");
                            }
                            out.println("\n");
                            out.println("----------------------------------<br>");
                        }
                        %>
                        </h3>
                        </div>
                    </h3>
                </div>
            </div>
        <div class="input-group">
            <p><a href="/TpfinalApweb/Paneles/PanelConsultaJuegos.jsp" class="alt-form">Atras</a></p>
           
        </div>
        <div class="input-group">
            <p><a href="PanelPrincipal.jsp" class="alt-form">volver al panel</a></p>
           
        </div>
    </body>
</html>