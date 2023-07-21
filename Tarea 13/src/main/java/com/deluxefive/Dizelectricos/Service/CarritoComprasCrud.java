package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.CarritoCompras;
import com.deluxefive.Dizelectricos.Repository.CarritoComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoComprasCrud implements CarritoComprasService {
    private CarritoComprasRepository carritoComprasRepository;

    @Autowired
    public CarritoComprasCrud(CarritoComprasRepository carritoComprasRepository) {
        this.carritoComprasRepository = carritoComprasRepository;
    }

    @Override
    public List<CarritoCompras> consultarCarritos() {
        return (List<CarritoCompras>) carritoComprasRepository.findAll();
    }

    @Override
    public CarritoCompras crearCarrito(CarritoCompras carritoCompras) {
        carritoCompras.setCantidadP(carritoCompras.getCantidadP());
        return carritoComprasRepository.save(carritoCompras);
    }

    @Override
    public CarritoCompras modificarCarrito(CarritoCompras carritoCompras) {
        return carritoComprasRepository.save(carritoCompras);
    }

    @Override
    public CarritoCompras buscarCarrito(int id) {
        return carritoComprasRepository.findById(id).get();
    }

    @Override
    public void eliminarCarrito(int id) {
        carritoComprasRepository.deleteById(id);
    }
}


