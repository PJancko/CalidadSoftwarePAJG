<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UsuarioController;

Route::get('/', function () {
    return view('welcome');
});

Route::get('/usuarios/create', [UsuarioController::class, 'create']);
Route::post('/usuarios', [UsuarioController::class, 'store'])->name('usuarios.store');