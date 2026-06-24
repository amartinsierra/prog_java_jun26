package com.cursojava.ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {
		String dir="c:\\temp\\pruebas.txt";
		FileOutputStream fos=null;
		PrintStream out=null;
		try {
			fos=new FileOutputStream(dir, true);//modo append
			out=new PrintStream(fos);
			out.println("hoy es miércoles");
			out.println("mañana es jueves");
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			if(out!=null) {
				out.close();
			}			
			try {
				if(fos!=null) {
					fos.close();
				}				
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
