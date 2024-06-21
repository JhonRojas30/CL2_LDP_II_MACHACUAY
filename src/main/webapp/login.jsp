<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" id="usuario" name="usuario" required><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>
    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>
</body>
</html>
