package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.CarritoCompras;

import java.util.List;

public interface CarritoComprasService {
    List<CarritoCompras> consultarCarritos();
    CarritoCompras crearCarrito(CarritoCompras carritocompras);
    CarritoCompras modificarCarrito(CarritoCompras carritocompras);
    CarritoCompras buscarCarrito(int id);
    void eliminarCarrito(int id);
}
