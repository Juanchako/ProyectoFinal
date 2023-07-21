package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.AgregaProductoAd;

import java.util.List;

public interface AgregaProductoAdService {
    List<AgregaProductoAd> consultarProductosAd();
    AgregaProductoAd crearProductoAd(AgregaProductoAd agregaproductoad);
    AgregaProductoAd modificarProductoAd(AgregaProductoAd agregaproductoad);
    AgregaProductoAd buscarProductoAd(int id);
    void eliminarProductoAd(int id);
}
