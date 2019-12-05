package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@Controller
public class pesonaController {

	@Autowired
	IPersonaService personaService;
	
	@GetMapping("/personas")
	public ModelAndView listado(){
		ModelAndView modelo = new ModelAndView("persona", "personas", personaService.listar());
		//modelo.addObject("personas", personaService.listar());
		modelo.addObject("titulo", "Soy titulo");
		return modelo;
		//return personaService.listar();
	}
	
	@PostMapping("/personas")
	public ModelAndView insertar(@ModelAttribute("persona") Persona persona , 
		      BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
	        return new ModelAndView("xd");
	    }
		/*Persona persona = new Persona();
		persona.setDni("87654321");
		persona.setNombres("nombres de prueba");
		persona.setDireccion("Direccion 2");
		persona.setEdad(25);*/
		//personaService.registrar(persona);
		return new ModelAndView("persona", "personas", personaService.listar());
	}
	
}
