<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UsuarioController extends Controller
{
    private static $usuarios = [];

    public function create()
    {
        return view('usuarios.create');
    }

    public function store(Request $request)
    {
        $validated = $request->validate([
            'nombre' => 'required|string|max:50',
            'apellido' => 'required|string|max:50',
            'email' => 'required|email',
            'sexo' => 'required|in:M,F',
        ]);

        self::$usuarios[] = $validated;

        return view('usuarios.lista', ['usuarios' => self::$usuarios]);
    }
}
