<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Proyecto Final</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <div class="cod-container">
        <div class="form-header">
            <img src="img/Logo.png" alt="Logo de CodigoMasters">
            <h1>Parque<span>TodoCode</span></h1>
        </div>

        <div class="form-content">
            <form action="ServletLogin" class="cod-form" method="POST">
                <div class="form-title">
                    <h3>Iniciar Sesión</h3>
                </div>

                <div class="input-group">
                    <input type="text" class="form-input" name="form-input" id="correo" required>
                    <label class="label" for="correo">Usuario</label>
                </div>

                <div class="input-group">
                    <input type="password" class="form-input" name="form-pass" id="pass" required>
                    <label class="label" for="pass">Contraseña</label>
                </div>

                <div class="input-group">
                    <input type="submit" class="form-input" value="Iniciar Sesión">
                </div>
               
            </form>
        </div>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/form.js"></script>
</body>
</html>