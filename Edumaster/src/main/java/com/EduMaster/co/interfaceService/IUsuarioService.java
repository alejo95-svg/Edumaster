package com.edumaster.co.interfaceService;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.edumaster.co.modelo.Usuario;


public interface IUsuarioService {
	public List<Usuario>listarUsuario();
	public Optional<Usuario>listarCedulaUsuario(BigInteger Cedula);
	public int saveUsuario(Usuario c);
	public void deleteUsuario(BigInteger Cedula);
}
