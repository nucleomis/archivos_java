<%@page import="Logica.Juego"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Buscar Encargado</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="/TpfinalApweb/img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Busqueda<span> Encargado</span></h1>
        </div>

        <div class="form-content">
            <form action="/TpfinalApweb/ListaEncargadosPorJuego.jsp" method="POST" id="b" class="cod-form">
                <div class="form-title">
                    <h3>Seleccione el Juego</h3>
                </div>

                <div class="input-group">
                   <label class ="label"for = "juego">Juego</label>
                    <select name="juego" class="" required >
                        <%Controladora control = new Controladora();
                        List <Juego> game = control.ListaJuegos();
                        for (Juego juego : game){
                            out.println("<option value = "+juego.getNombre()+">"+juego.getNombre()+"</option>");
                        }
         
                        %>
                        
                    </select>
                </div>
                
                <div class="input-group">
                    <input type="submit" class="form-input" value="Buscar" id="bt">
                    <p><a href="/TpfinalApweb/Paneles/PanelConsultaJuegos.jsp" class="alt-form">Volver</a></p>
                </div>
            </form>
        </div>


    </div>
    
    <script src="/TpfinalApweb/js/jquery-3.3.1.min.js"></script>
    <script src="/TpfinalApweb/js/form.js"></script>
</body>
</html>