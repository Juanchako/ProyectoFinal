package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}

