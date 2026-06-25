package com.cursojava.listas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Alumno {
	private String nombre;
	private String curso;
	private double nota;
	
	
}
