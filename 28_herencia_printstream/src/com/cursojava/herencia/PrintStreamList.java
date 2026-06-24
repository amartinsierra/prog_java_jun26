package com.cursojava.herencia;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamList extends PrintStream{
	public PrintStreamList(String ruta) throws FileNotFoundException{
		super(ruta);
	}
	
	public void printList(ArrayList<String> lista) {
		for(String dato:lista) {
			println(dato);
		}
	}
}
