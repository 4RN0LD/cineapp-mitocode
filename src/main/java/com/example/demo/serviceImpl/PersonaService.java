package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {
	
	public static List<Persona> personas = new ArrayList<>();
	
	@Override
	public Persona registrar(Persona persona) {
		/*persona = new Persona();
		persona.setDni("48365243");
		persona.setNombres("Arnold Alfredo Norabuena Aranda");*/
		//registrar persona
		return persona;
	}

	@Override
	public List<Persona> listar() {
		return personas;
	}

	@Override
	public Persona modificar(Persona persona) {
		// modificar persona
		personas.add(persona);
		return persona;
	}

	@Override
	public void eliminar(Integer id) {
		//eliminar
	}

	@Override
	public Persona listarPorId(Integer id) {
		return new Persona();
	}

}
