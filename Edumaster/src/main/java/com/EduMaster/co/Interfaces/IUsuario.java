package com.EduMaster.co.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.EduMaster.co.Modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{
	
}
