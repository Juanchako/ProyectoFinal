package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.CarritoCompras;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoComprasRepository extends CrudRepository<CarritoCompras, Integer> {

}

