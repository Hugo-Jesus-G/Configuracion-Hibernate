package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_estudiante	;
	
	private String nombre;
	
	
	public Alumno() {
		
		
		
	}
	
	public Alumno(int id,String nombre) {
		this.id_estudiante=id;
		this.nombre=nombre;
		
		
	}

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [id_estudiante=" + id_estudiante + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
