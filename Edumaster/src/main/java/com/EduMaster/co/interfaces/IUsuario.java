package com.edumaster.co.interfaces;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edumaster.co.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, BigInteger>{

}
