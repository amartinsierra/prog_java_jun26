package com.cursojava.abstractas;

public abstract sealed class Figura permits Circulo, Rectangulo{
	private String color;
	public Figura(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public abstract double superficie(); 
}
