package com.visitas.controller;

import com.visitas.model.entities.Usuario;
import com.visitas.model.service.UsuarioServiceImp;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
    
    @Autowired
	private UsuarioServiceImp<Usuario> usuarioService;
	
	@RequestMapping(value = "/login")
	public String login(Model model) {
		model.addAttribute("titulo", "Login");
		return "login";
	}
        
        @RequestMapping(value = "/listaUsuarios")
	public String listar(Model model) {

		model.addAttribute("usuarios", usuarioService.findAll());
		return "usuarios";
	}
        
        
	@RequestMapping(value = "/editarUsuario/{idUsuario}")
	public String editarUsuario(@PathVariable(value = "idUsuario") Long id, Map<String, Object> model) {
		Usuario usuario = usuarioService.findByUsername(("id"));
		model.put("opcion", "Editar usuario");
		model.put("usuario", usuario);
		return "editarUsuario";
	}
        
        @RequestMapping(value = "/editarUsuario")
	public String editarUsuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo","Nuevo usuario");
		model.addAttribute("opcion","Nuevo usuario");
		model.addAttribute("usuario",usuario);
		return "editarUsuario";
	}
        
   
        
}
