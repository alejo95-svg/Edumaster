package com.edumaster.co.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edumaster.co.interfaceService.IUsuarioService;
import com.edumaster.co.interfaces.IUsuario;
import com.edumaster.co.modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	@Autowired
	private IUsuario data;
	
	@Override
	public List<Usuario> listarUsuario() {
		return (List<Usuario>) data.findAll();
	}

	@Override
	public Optional<Usuario> listarCedulaUsuario(BigInteger id) {
		return data.findById(id);
	}

	@Override
	public int saveUsuario(Usuario p) {
		int res=0;
		Usuario Usuario = data.save(p);
		if(!Usuario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteUsuario(BigInteger id) {
		data.deleteById(id);
	}

}
