package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> consultarProductos();
    Producto crearProducto(Producto producto);
    Producto modificarProducto(Producto producto);
    Producto buscarProducto(int id);
    void eliminarProducto(int id);
}
