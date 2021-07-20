
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Panel de control</title>
    <link rel="stylesheet" href="css/estilos.css">
    
</head>
    <body>
        <%
        HttpSession misesion = request.getSession();
        String usu =(String)request.getSession().getAttribute("usuario");
        
        if (usu == null){
            response.sendRedirect("Login.jsp");
        }
        else{
            %>
        
        
        <div class="cod-container">
            <div class="form-header">
                <img src="img/Logo.png" alt="Logo de CodigoMasters">
                <h1>Panel<span> principal</span></h1>
            </div>
            <div class="form-title">
            <h2>
                <a href="Paneles/PanelEmpleado.jsp" class="alt-form">Empleados</a>
            </h2>
            </div>
            
            <div class="form-title">
            <h2>    
                <a href="Paneles/PanelDeJuegos.jsp" class="alt-form">Juegos</a>
            </h2>
            </div>
            
            <div class="form-title">
            <h2>
                <a href="Paneles/PanelClientes.jsp" class="alt-form">Clientes</a>
            </h2>
            </div>
            
            <div class="form-title">
            <h2>
                <a href="Paneles/PanelEntradas.jsp" class="alt-form">Entradas</a>
            </h2>
            </div> 
            
        <div class="input-group">
            <form action="/TpfinalApweb/Cerrarsesion" method="POST" id="b" class="cod-form">
                <input type="submit" value="Cerrar sesion"></a></p>
            </form>
        </div>   
            
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/form.js"></script>
        <%
            }
        %>
    </body>
</html>
