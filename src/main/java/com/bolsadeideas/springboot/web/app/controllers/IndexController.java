package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> robert
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
<<<<<<< HEAD
	
	@GetMapping({"/index", "/", "/home"})
	public String index (Model model){
		
		model.addAttribute("titulo", "hola spring framwork");
		
=======

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring con Model!");
>>>>>>> robert
		return "index";
	}

	@RequestMapping("/perfil")
<<<<<<< HEAD
	
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre("David");
		usuario.setApellido("Driotis");
		usuario.setEmail("david.driotis@gmail.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
@RequestMapping("/listar")
	
	public String listar(Model model) {
	
	List<Usuario> usuarios = new ArrayList<>();
	
	usuarios.add(new Usuario( "David", "Driotis", "david.driotis@gmail.com"));
	usuarios.add(new Usuario( "Johny", "Cruz", "Johny.Cruz@gmail.com"));
	usuarios.add(new Usuario( "Miguel", "Zelada", "Miguel.Zelada@gmail.com"));
	usuarios.add(new Usuario( "Minor", "Martinez", "Minor.Martinez@gmail.com"));

	model.addAttribute("titulo", "Listado de usuarios");
	model.addAttribute("usuarios", usuarios);
	return "listar";

}
}

=======
	public String perfil(Model model) {

		Usuario usuario = new Usuario();

		usuario.setNombre("Andres");
		usuario.setApellido("Guzman");
		usuario.setEmail("andres@correo.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		Usuario usuario = new Usuario();
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres", "Guzman", "andres@correo.com"),
				new Usuario("Jhon", "Doe", "jhon@correo.com"),
				new Usuario("Jane", "Doe", "jane@correo.com"),
				new Usuario("Tornado", "Roe", "roe@correo.com"));
		

		model.addAttribute("titulo", "listado de usuarios");
		model.addAttribute("usuarios", usuarios);

		return "listar";
	}
}
>>>>>>> robert
