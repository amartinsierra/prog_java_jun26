package com.cursojava.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		String dir="c:\\temp\\prueba.txt";
		try(FileReader fr=new FileReader(dir);
				BufferedReader bf=new BufferedReader(fr);){
			String linea=bf.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=bf.readLine();
			}
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
