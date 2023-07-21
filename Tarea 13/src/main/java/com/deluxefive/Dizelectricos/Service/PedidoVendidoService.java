package com.deluxefive.Dizelectricos.Service;

import com.deluxefive.Dizelectricos.Entity.PedidoVendido;

import java.util.List;

public interface PedidoVendidoService {
    List<PedidoVendido> consultarPedidosVendidos();
    PedidoVendido crearPedidoVendido(PedidoVendido pedidovendido);
    PedidoVendido modificarPedidoVendido(PedidoVendido pedidovendido);
    PedidoVendido buscarPedidoVendido(int id);
    void eliminarPedidoVendido(int id);
}
