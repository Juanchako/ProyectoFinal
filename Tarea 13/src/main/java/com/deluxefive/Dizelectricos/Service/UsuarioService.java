package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> consultarUsuarios();
    Usuario crearUsuario(Usuario usuario);
    Usuario modificarUsuario(Usuario usuario);
    Usuario buscarUsuario(int id);
    void eliminarUsuario(int id);
}
