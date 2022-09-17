package com.EduMaster.co.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EduMaster.co.InterfaceService.IUsuarioService;
import com.EduMaster.co.Interfaces.IUsuario;
import com.EduMaster.co.Modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	@Autowired
	private IUsuario data;
	
	@Override
	public List<Usuario> listar(){
		return (List<Usuario>) data.findAll();
	}
	
	@Override
	public Optional<Usuario> listarCedula(int cedula){
		return data.findById(cedula);
	}
	
	@Override
	public int save(Usuario u) {
		System.out.println("voy aqui");
		int res=0;
		Usuario usuario = data.save(u);
		if(!usuario.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int cedula) {
		data.deleteById(cedula);
	}
	
}
