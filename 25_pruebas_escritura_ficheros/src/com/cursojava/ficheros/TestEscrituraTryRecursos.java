package com.cursojava.ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraTryRecursos {

	public static void main(String[] args) {
		String dir="c:\\temp\\pruebas.txt";
		
		try(FileOutputStream fos=new FileOutputStream(dir, true);
				PrintStream out=new PrintStream(fos);	) {
			out.println("hoy es miércoles");
			out.println("mañana es jueves");
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
