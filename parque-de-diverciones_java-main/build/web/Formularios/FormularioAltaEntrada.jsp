<%@page import="Logica.Juego"%>
<%@page import="Logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Generar entrada</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="/TpfinalApweb/img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Formulario<span> entrada</span></h1>
        </div>

        <div class="form-content">
            <form action="/TpfinalApweb/CrearEntrada" method="POST" id="b" class="cod-form">
                <div class="form-title">
                    <h3>Rellenar</h3>
                </div>

                <div class="input-group">
                   <label class ="label"for = "cliente">Cliente </label>
                    <select name="cliente" class="" required >
                        <%Controladora control = new Controladora();
                        List <Cliente> em = control.ListaCliente();
                        for (Cliente emple : em){
                            out.println("<option value = "+emple.getNombre()+">"+emple.getNombre()+"</option>");
                        }
         
                        %>
                        
                    </select>
                </div>

                <div class="input-group">
                    <input type="date" class="form-input" name="fecha" id="edad" required>
                    <label class="label" for="fecha">fecha</label>
                </div>
                
                
               <div class="input-group">
                   <label class ="label"for = "juego">Juegos</label>
                    <select name="juego" class="" required >
                        <%
                        
                        List <Juego> ju = control.ListaJuegos();
                        for (Juego emple : ju){
                            out.println("<option value = "+emple.getNombre()+">"+emple.getNombre()+"</option>");
                        }
         
                        %>
                        
                    </select>
                </div>
                
                <div class="input-group">
                   <label class ="label"for = "horario">horario </label>
                    <select name="horario" class="" required >
                        <option value="8:00 a 12:00">8 a 12</option>
                        <option value="17:00 a 21:00">17 a 21</option>
                        <option value="todoeldia">todo el dia</option>
                    </select>
                </div>
                    </select>
                </div>

                <div class="input-group">
                    <input type="submit" class="form-input" value="GENERAR ENTRADA" id="bt">
                    <p><a href="/TpfinalApweb/Paneles/PanelEntradas.jsp" class="alt-form">Volver</a></p>
                </div>
            </form>
        </div>


    </div>
    
    <script src="/TpfinalApweb/js/jquery-3.3.1.min.js"></script>
    <script src="/TpfinalApweb/js/form.js"></script>
</body>
</html>
