package com.cursojava.abstractas;

public non-sealed class Rectangulo extends Figura{
	private int largo, ancho;

	public Rectangulo(String color, int largo, int ancho) {
		super(color);
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public double superficie() {
		return largo*ancho;
	}
	
}
