package com.cursojava.ficheros;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {
	public static void main(String[] args) {
		String dir="c:\\temp\\pruebas.txt";
		try {
			PrintStream out=new PrintStream(dir);//modo sobrescritura
			out.println("hoy es miércoles");
			out.println("mañana es jueves");
			out.close();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
