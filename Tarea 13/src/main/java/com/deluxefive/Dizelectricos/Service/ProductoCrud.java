package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Producto;
import com.deluxefive.Dizelectricos.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoCrud implements ProductoService {
    @Autowired
    private ProductoRepository productoRepo;

    public ProductoCrud(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }

    @Override
    public List<Producto> consultarProductos() {
        return (List<Producto>) productoRepo.findAll();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        producto.setAgregaProductoAd(producto.getAgregaProductoAd());
        return productoRepo.save(producto);
    }

    @Override
    public Producto modificarProducto(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public Producto buscarProducto(int id) {
        return productoRepo.findById(id).get();
    }

    @Override
    public void eliminarProducto(int id) {
        productoRepo.deleteById(id);
    }
}
