<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Persona;

class PersonaController extends Controller
{
    // GET /personas
    public function index()
    {
        return response()->json(Persona::all(), 200);
    }

    // GET /personas/{id}
    public function show($id)
    {
        $persona = Persona::find($id);

        if (!$persona) {
            return response()->json(['message' => 'Persona no encontrada'], 404);
        }

        return response()->json($persona, 200);
    }

    // POST /personas
    public function store(Request $request)
    {
        $request->validate([
            'nombres' => 'required|string|max:255',
            'apellidos' => 'required|string|max:255',
            'correo' => 'required|email|unique:personas,correo',
            'sexo' => 'required|string|max:50',
        ]);

        $persona = Persona::create($request->all());

        return response()->json($persona, 201);
    }

    // PUT /personas/{id}
    public function update(Request $request, $id)
    {
        $persona = Persona::find($id);

        if (!$persona) {
            return response()->json(['message' => 'Persona no encontrada'], 404);
        }

        $request->validate([
            'nombres' => 'sometimes|required|string|max:255',
            'apellidos' => 'sometimes|required|string|max:255',
            'correo' => 'sometimes|required|email|unique:personas,correo,' . $persona->id,
            'sexo' => 'sometimes|required|in:M,F',
        ]);

        $persona->update($request->all());

        return response()->json($persona, 200);
    }

    // DELETE /personas/{id}
    public function destroy($id)
    {
        $persona = Persona::find($id);

        if (!$persona) {
            return response()->json(['message' => 'Persona no encontrada'], 404);
        }

        $persona->delete();

        return response()->json(['message' => 'Persona eliminada correctamente'], 200);
    }
}
