package com.cursojava.cadenas;

import java.util.Scanner;

public class Presupuestos {

	public static void main(String[] args) {
		String[] coches= {"Volvo-11500",
				"Audi A1-22300",
				"Totyota Yaris-17400",
				"Seat Ibiza-9800",
				"Mercedes A-18000",
				"BMW-25450",
				"Mercedes B-16200"};
		Scanner scan=new Scanner(System.in);
		int presupuesto;
		System.out.println("Introduce presupuesto:");
		presupuesto=scan.nextInt();
		for(String coche:coches) {
			String[] datos=coche.split("-");
			if(presupuesto>=Integer.parseInt(datos[1])) {
				System.out.println("Puedes comprar: "+datos[0]+" que vale: "+datos[1]);
			}
		}
	}

}
