package com.visitas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("respuesta","usuario o clave incorrectos");
		return "index";
	}
	
	@RequestMapping(value = "/")
	public String index2(Model model) {
		model.addAttribute("titulo", "Inicio");
		return "index";
	}
	
	
}
