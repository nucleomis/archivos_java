<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Baja Empleado</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="/TpfinalApweb/img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Baja<span> empleado</span></h1>
        </div>

        <div class="form-content">
            <form action="/TpfinalApweb/BorrarEmpleado" method="POST" id="b" class="cod-form">
                <div class="form-title">
                    <h3>Rellenar</h3>
                </div>

                <div class="input-group">
                    <input type="text" class="form-input" name="nombre" id="nombre" required>
                    <label class="label" for="nombre">Nombre</label>
                </div>
                
                <div class="input-group">
                    <input type="submit" class="form-input" value="Dar de baja" id="bt">
                    <p><a href="/TpfinalApweb/Paneles/PanelEmpleado.jsp" class="alt-form">Volver</a></p>
                </div>
            </form>
        </div>


    </div>
    
    <script src="/TpfinalApweb/js/jquery-3.3.1.min.js"></script>
    <script src="/TpfinalApweb/js/form.js"></script>
</body>
</html>
