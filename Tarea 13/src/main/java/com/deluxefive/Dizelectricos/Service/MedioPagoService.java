package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.MedioPago;

import java.util.List;

public interface MedioPagoService {
    List<MedioPago> consultarMediosPago();
    MedioPago crearMedioPago(MedioPago mediopago);
    MedioPago modificarMedioPago(MedioPago mediopago);
    MedioPago buscarMedioPago(int id);
    void eliminarMedioPago(int id);
}
