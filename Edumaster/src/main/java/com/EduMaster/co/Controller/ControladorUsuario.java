package com.EduMaster.co.Controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.EduMaster.co.InterfaceService.IUsuarioService;
import com.EduMaster.co.Modelo.Usuario;

@Controller
@RequestMapping
public class ControladorUsuario {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario> Usuario = service.listar();
		model.addAttribute("Usuario", Usuario);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("Usuario", new Usuario());
		return "InsertarUsuario";
	}
	
	@PostMapping("/save")
	public String save(@Validated Usuario u, Model model) {
		service.save(u);
		return "redirect:/listar";		
	}
	
	@GetMapping("/editar/{Cedula}")
	public String editar(@PathVariable int cedula, Model model) {
		Optional<Usuario>usuario = service.listarCedula(cedula);
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@GetMapping("/eliminar/{Cedula}")
	public String eliminar(@PathVariable int cedula, Model model) {
		service.delete(cedula);
		return "redirect:/listar";
	}

	
}
