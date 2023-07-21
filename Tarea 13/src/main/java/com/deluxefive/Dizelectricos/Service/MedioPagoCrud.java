package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.MedioPago;
import com.deluxefive.Dizelectricos.Repository.MedioPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioPagoCrud implements MedioPagoService {
    @Autowired
    private MedioPagoRepository medioPagoRepo;

    public MedioPagoCrud(MedioPagoRepository medioPagoRepo) {
        this.medioPagoRepo = medioPagoRepo;
    }

    @Override
    public List<MedioPago> consultarMediosPago() {
        return (List<MedioPago>) medioPagoRepo.findAll();
    }

    @Override
    public MedioPago crearMedioPago(MedioPago medioPago) {
        medioPago.setTipoPago(medioPago.getTipoPago());
        return medioPagoRepo.save(medioPago);
    }

    @Override
    public MedioPago modificarMedioPago(MedioPago medioPago) {
        return medioPagoRepo.save(medioPago);
    }

    @Override
    public MedioPago buscarMedioPago(int id) {
        return medioPagoRepo.findById(id).get();
    }

    @Override
    public void eliminarMedioPago(int id) {
        medioPagoRepo.deleteById(id);
    }
}