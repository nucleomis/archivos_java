<%@page import="Logica.Empleado"%>
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
    <title>Alta Juego</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="/TpfinalApweb/img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Formulario<span> juego</span></h1>
        </div>

        <div class="form-content">
            <form action="/TpfinalApweb/CrearJuego" method="POST" id="b" class="cod-form">
                <div class="form-title">
                    <h3>Rellenar</h3>
                </div>

                <div class="input-group">
                    <input type="text" class="form-input" name="nombre" id="nombre" required>
                    <label class="label" for="nombre">Nombre</label>
                </div>

                <div class="input-group">
                    <input type="number" class="form-input" name="capacidad" id="apellido" required>
                    <label class="label" for="capacidad">Capacidad</label>
                </div>
               <div class="input-group">
                   <label class ="label"for = "horario">horario </label>
                    <select name="horario" class="" required >
                        <option value="8:00 a 12:00">8 a 12</option>
                        <option value="17:00 a 21:00">17 a 21</option>
                        <option value="todoeldia">todo el dia</option>
                    </select>
                </div>
                <div class="input-group">
                   <label class ="label"for = "responsable">Responsable </label>
                    <select name="responsable" class="" required >
                        <%Controladora control = new Controladora();
                        List <Empleado> em = control.ListaEmpleados();
                        for (Empleado emple : em){
                            out.println("<option value = "+emple.getNombre()+">"+emple.getNombre()+"</option>");
                        }
         
                        %>
                        
                    </select>
                </div>
                

                <div class="input-group">
                    <input type="submit" class="form-input" value="Crear Juego" id="bt">
                    <p><a href="/TpfinalApweb/Paneles/PanelDeJuegos.jsp" class="alt-form">Volver</a></p>
                </div>
            </form>
        </div>


    </div>
    
    <script src="/TpfinalApweb/js/jquery-3.3.1.min.js"></script>
    <script src="/TpfinalApweb/js/form.js"></script>
</body>
</html>
