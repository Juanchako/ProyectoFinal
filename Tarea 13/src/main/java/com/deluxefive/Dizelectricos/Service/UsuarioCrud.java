package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Usuario;
import com.deluxefive.Dizelectricos.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioCrud implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;

    public UsuarioCrud(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public List<Usuario> consultarUsuarios() {
        return (List<Usuario>) usuarioRepo.findAll();
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        usuario.setCorreoU(usuario.getCorreoU());
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario buscarUsuario(int id) {
        return usuarioRepo.findById(id).get();
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioRepo.deleteById(id);
    }
}
