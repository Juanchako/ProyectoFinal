package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.PedidoVendido;
import com.deluxefive.Dizelectricos.Repository.PedidoVendidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoVendidoCrud implements PedidoVendidoService {
    @Autowired
    private PedidoVendidoRepository pedidoVendidoRepo;

    public PedidoVendidoCrud(PedidoVendidoRepository pedidoVendidoRepo) {
        this.pedidoVendidoRepo = pedidoVendidoRepo;
    }

    @Override
    public List<PedidoVendido> consultarPedidosVendidos() {
        return (List<PedidoVendido>) pedidoVendidoRepo.findAll();
    }

    @Override
    public PedidoVendido crearPedidoVendido(PedidoVendido pedidoVendido) {
        pedidoVendido.setFechaEntregaP(pedidoVendido.getFechaEntregaP());
        return pedidoVendidoRepo.save(pedidoVendido);
    }

    @Override
    public PedidoVendido modificarPedidoVendido(PedidoVendido pedidoVendido) {
        return pedidoVendidoRepo.save(pedidoVendido);
    }

    @Override
    public PedidoVendido buscarPedidoVendido(int id) {
        return pedidoVendidoRepo.findById(id).get();
    }

    @Override
    public void eliminarPedidoVendido(int id) {
        pedidoVendidoRepo.deleteById(id);
    }
}
