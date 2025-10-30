<!DOCTYPE html>
<html>
<head>
    <title>Registro de Usuario</title>
</head>
<body>
    <h1>Registrar Usuario</h1>

    @if ($errors->any())
        <div style="color: red;">
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif

    <form method="POST" action="{{ route('usuarios.store') }}">
        @csrf
        
        <label>Nombre:</label>
        <input type="text" name="nombre" value="{{ old('nombre') }}"><br><br>

        <label>Apellido:</label>
        <input type="text" name="apellido" value="{{ old('apellido') }}"><br><br>

        <label>Email:</label>
        <input type="email" name="email" value="{{ old('email') }}"><br><br>

        <label>Sexo:</label>
        <select name="sexo">
            <option value="">Seleccione...</option>
            <option value="masculino" {{ old('sexo') == 'M' ? 'selected' : '' }}>Masculino</option>
            <option value="femenino" {{ old('sexo') == 'F' ? 'selected' : '' }}>Femenino</option>
        </select><br><br>

        <button type="submit">Registrar</button>
    </form>
</body>
</html>
