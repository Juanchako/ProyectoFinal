package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.PedidoVendido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoVendidoRepository extends CrudRepository<PedidoVendido, Integer> {

}
