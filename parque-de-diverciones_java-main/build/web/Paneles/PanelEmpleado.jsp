
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Panel de Empleado</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
    <body>
        <div class="cod-container">
            <div class="form-header">
            <h1>Panel<span> de Empleado</span></h1>
            </div>
            <h2>
                <div class="input-group">
                <h4 align="center"><a href="/TpfinalApweb/Formularios/FormularioAltaEmpleado.jsp" class="alt-form">Alta</a></h4>
                </div>
                <div class="input-group">
                <h4 align="center"><a href="/TpfinalApweb/Formularios/FormularioBajaEmpleado.jsp" class="alt-form">Baja</a></h4>
                </div>
                <div class="input-group">
                <h4 align="center"><a href="/TpfinalApweb/Modifi/ModificarEmpleado1.jsp" class="alt-form">Modificacion</a></h4>
                </div>
                <div class="input-group">
                <h4 align="center"><a href="/TpfinalApweb/Paneles/PanelConsultaEmpleado.jsp" class="alt-form">Consultas</a></h4>
                </div>
            </h2>
        
        <div class="input-group">
            
           <div class="input-group">
               <form action="/TpfinalApweb/PanelPrincipal.jsp" method="POST" id="b" class="cod-form">
                <input type="submit" value="volver"></a></p>
            </form>
            <form action="/TpfinalApweb/Cerrarsesion" method="POST" id="b" class="cod-form">
                <input type="submit" value="Cerrar sesion"></a></p>
            </form>
        </div> 
        </div>
    </body>
</html>

