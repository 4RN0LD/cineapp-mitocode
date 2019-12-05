package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {
	Persona registrar(Persona persona);
	List<Persona> listar();
	Persona modificar(Persona persona);
	void eliminar(Integer id);
	Persona listarPorId(Integer id);
}
