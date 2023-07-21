package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.AgregaProductoAd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgregaProductoAdRepository extends CrudRepository<AgregaProductoAd, Integer> {

}
