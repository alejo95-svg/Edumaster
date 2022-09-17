package com.EduMaster.co.InterfaceService;
import java.util.List;
import java.util.Optional;
import com.EduMaster.co.Modelo.Usuario;
public interface IUsuarioService {
	
	public List<Usuario> listar();
	public Optional<Usuario> listarCedula(int cedula);
	public int save(Usuario u);
	public void delete(int cedula);
	
}
