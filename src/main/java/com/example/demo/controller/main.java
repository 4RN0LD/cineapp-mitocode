package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class main {
	
	@GetMapping("/listar")
	public String listar(Model model, @RequestParam(value = "valor", required = false, defaultValue = "valor por defecto") String variable ) {
		variable = "Este es su nuevo valor";
		model.addAttribute("variable", variable);
		return "main";
	}
}
