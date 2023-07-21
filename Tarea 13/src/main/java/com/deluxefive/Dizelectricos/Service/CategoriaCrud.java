package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Categoria;
import com.deluxefive.Dizelectricos.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaCrud implements CategoriaService {
    private final CategoriaRepository categoriaRepo;

    @Autowired
    public CategoriaCrud(CategoriaRepository categoriaRepository) {
        this.categoriaRepo = categoriaRepository;
    }

    @Override
    public List<Categoria> consultarCategorias() {
        return (List<Categoria>) categoriaRepo.findAll();
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        categoria.setTipoCategoria(categoria.getTipoCategoria());
        return categoriaRepo.save(categoria);
    }

    @Override
    public Categoria modificarCategoria(Categoria categoria) {
        return categoriaRepo.save(categoria);
    }

    @Override
    public Categoria buscarCategoria(int id) {
        return categoriaRepo.findById(id).get();
    }

    @Override
    public void eliminarCategoria(int id) {
        categoriaRepo.deleteById(id);
    }
}
