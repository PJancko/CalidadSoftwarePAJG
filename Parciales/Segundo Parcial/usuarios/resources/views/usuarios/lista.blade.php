<!DOCTYPE html>
<html>
<head>
    <title>Usuarios Registrados</title>
</head>
<body>
    <h1>Usuarios Registrados</h1>

    <a href="/usuarios/create">Volver al registro</a>

    <ul>
        @foreach ($usuarios as $usuario)
            <li>
                {{ $usuario['nombre'] }} {{ $usuario['apellido'] }} - {{ $usuario['email'] }} ({{ $usuario['sexo'] }})
            </li>
        @endforeach
    </ul>
</body>
</html>
