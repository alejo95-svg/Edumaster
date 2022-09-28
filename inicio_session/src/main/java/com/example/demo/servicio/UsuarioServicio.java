package com.example.demo.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.dto.UsuarioRegistroDTO;
import com.example.demo.modelo.Usuarios;

public interface UsuarioServicio extends UserDetailsService{
	public Usuarios guardar(UsuarioRegistroDTO registroDTO);
	public List<Usuarios>  listarUsuarios();
}
