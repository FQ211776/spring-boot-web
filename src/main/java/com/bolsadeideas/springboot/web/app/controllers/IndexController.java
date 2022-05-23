package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring con Model!");
		return "index";
	}

	@RequestMapping("/perfil")

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


	model.addAttribute("titulo", "Listado de usuarios");
	model.addAttribute("usuarios", usuarios);

		return "listar";
	}
}

