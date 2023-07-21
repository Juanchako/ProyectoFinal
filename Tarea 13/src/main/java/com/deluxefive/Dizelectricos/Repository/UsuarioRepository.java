package com.deluxefive.Dizelectricos.Repository;

import com.deluxefive.Dizelectricos.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}

