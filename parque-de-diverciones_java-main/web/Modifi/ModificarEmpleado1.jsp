<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Modificar Empleado</title>
    <link rel="stylesheet" href="/TpfinalApweb/css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="/TpfinalApweb/img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Editar<span> empleado</span></h1>
        </div>

        <div class="form-content">
            <form action="/TpfinalApweb/ModificarEmpleado" method="POST" id="b" class="cod-form">
                <div class="form-title">
                    <h3>Rellenar</h3>
                </div>

                <div class="input-group">
                    <input type="text" class="form-input" name="nombre" id="nombre" required>
                    <label class="label" for="nombre">Nombre</label>
                </div>

                <div class="input-group">
                    <input type="text" class="form-input" name="apellido" id="apellido" required>
                    <label class="label" for="apellido">Apellido</label>
                </div>
                <div class="input-group">
                    <input type="number" class="form-input" name="dni" id="dni" required>
                    <label class="label" for="dni">Dni</label>
                </div>
                <div class="input-group">
                    <input type="number" class="form-input" name="edad" id="edad" required>
                    <label class="label" for="edad">Edad</label>
                </div>
                
                
               <div class="input-group">
                   <p>Sexo: </p>
                    <select name="sexo" class="" required >
                        <option value="hombre">Hombre</option>
                        <option value="mujer">Mujer</option>
                    </select>
                </div>

                <div class="input-group">
                    <input type="submit" class="form-input" value="Editar Empleado" id="bt">
                    <p><a href="/TpfinalApweb/Paneles/PanelEmpleado.jsp" class="alt-form">Panel printcipal</a></p>
                </div>
            </form>
        </div>
        

    </div>
    
    <script src="/TpfinalApweb/js/jquery-3.3.1.min.js"></script>
    <script src="/TpfinalApweb/js/form.js"></script>
</body>
</html>