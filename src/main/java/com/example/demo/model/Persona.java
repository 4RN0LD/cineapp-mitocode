package com.example.demo.model;

public class Persona {
	
	private String dni;
	private String nombres;
	private String direccion;
	private int edad;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombres=" + nombres + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
}
