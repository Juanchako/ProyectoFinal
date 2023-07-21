package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.AgregaProductoAd;
import com.deluxefive.Dizelectricos.Entity.MedioPago;
import com.deluxefive.Dizelectricos.Repository.AgregaProductoAdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgregaProductoAdCrud implements AgregaProductoAdService {
    private final AgregaProductoAdRepository agregaProductoAdRepo;

    @Autowired
    public AgregaProductoAdCrud(AgregaProductoAdRepository agregaProductoAdRepo) {
        this.agregaProductoAdRepo = agregaProductoAdRepo;
    }

    @Override
    public List<AgregaProductoAd> consultarProductosAd() {
        return (List<AgregaProductoAd>) agregaProductoAdRepo.findAll();
    }

    @Override
    public AgregaProductoAd crearProductoAd(AgregaProductoAd agregaproductoad) {
        agregaproductoad.setNombreAp(agregaproductoad.getNombreAp());
        return  agregaProductoAdRepo.save(agregaproductoad);
    }

    @Override
    public AgregaProductoAd modificarProductoAd(AgregaProductoAd agregaproductoad) {
        return agregaProductoAdRepo.save(agregaproductoad);
    }

    @Override
    public AgregaProductoAd buscarProductoAd(int id) {
        return agregaProductoAdRepo.findById(id).get();
    }

    @Override
    public void eliminarProductoAd(int id) {
        agregaProductoAdRepo.deleteById(id);
    }
}
