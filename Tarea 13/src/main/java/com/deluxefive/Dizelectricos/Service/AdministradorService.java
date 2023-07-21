package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Administrador;

import java.util.List;

public interface AdministradorService {
    public List<Administrador> consultarAdministrador();
    public Administrador crearAdministrador(Administrador administrador);
    public Administrador modificarAdministrador(Administrador administrador);
    public Administrador buscarAdministrador(int id);
    public void eliminarAdministrador(int id);
}
