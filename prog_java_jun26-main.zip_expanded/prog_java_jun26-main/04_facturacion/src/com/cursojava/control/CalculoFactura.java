package com.cursojava.control;

public class CalculoFactura {

	public static void main(String[] args) {
		//dado el precio de un producto y las unidades compradas,
		//calcular el total. Teniendo en cuenta:
		//si se compran más de 10 unidades, se aplica un 15%. Si se compran entre 7 y 10, un 10%
		//si se compran entre 4 y 6, un 5% de descuento
		double precioUnitario = 3.7;
		int unidades = 5;
		double precioBase = unidades * precioUnitario;
		double precioFinal;
		if (unidades > 10) {
			precioFinal = precioBase * 0.85;
		} else if (unidades >= 7) {
			precioFinal = precioBase * 0.90;
		} else if (unidades >= 4) {
			precioFinal = precioBase * 0.95;
		} else {
			precioFinal = precioBase;
		}
		System.out.println("Precio final: " + precioFinal);

	}

}
