package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.MedioPago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioPagoRepository extends CrudRepository<MedioPago, Integer> {

}

