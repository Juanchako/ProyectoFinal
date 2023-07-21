package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

}

