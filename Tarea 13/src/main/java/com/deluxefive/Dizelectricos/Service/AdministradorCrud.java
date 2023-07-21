package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Administrador;
import com.deluxefive.Dizelectricos.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorCrud implements AdministradorService {
    @Autowired
    private AdministradorRepository administradorRepo;

    public AdministradorCrud(AdministradorRepository administradorRepo) {
        this.administradorRepo = administradorRepo;
    }

    @Override
    public List<Administrador> consultarAdministrador() {
        return (List<Administrador>) administradorRepo.findAll();
    }

    @Override
    public Administrador crearAdministrador(Administrador administrador) {
        administrador.setCorreoA(administrador.getCorreoA());
        return administradorRepo.save(administrador);
    }

    @Override
    public Administrador modificarAdministrador(Administrador administrador) {
        return administradorRepo.save(administrador);
    }

    @Override
    public Administrador buscarAdministrador(int id) {
        return administradorRepo.findById(id).get();
    }

    @Override
    public void eliminarAdministrador(int id) {
        administradorRepo.deleteById(id);
    }
}