package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> consultarCategorias();
    Categoria crearCategoria(Categoria categoria);
    Categoria modificarCategoria(Categoria categoria);
    Categoria buscarCategoria(int id);
    void eliminarCategoria(int id);
}
