package com.cursojava.herencia;

public class Punto {
	private int x,y;
	public Punto() {
		x=5;
		y=10;
	}
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void dibujar() {
		System.out.println("x: "+x+", y: "+y);
	}
}
