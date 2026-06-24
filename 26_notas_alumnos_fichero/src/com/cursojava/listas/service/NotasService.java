package com.cursojava.listas.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	final String RUTA="c:\\temp\\notas.txt";
	public NotasService() {
		//comprobamos si existe el fichero y si no existe se crea
		File file=new File(RUTA);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void guardarNota(int nota) {
		try(FileOutputStream fos=new FileOutputStream(RUTA, true);
				PrintStream out=new PrintStream(fos);){
			out.println(nota);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public int aprobados() {
		String linea;
		int aprobados=0;
		try (FileReader fr =new FileReader (RUTA);
				BufferedReader bf= new BufferedReader(fr);){
			while ((linea=bf.readLine())!=null) {  // lee la línea y al mismo tiempo la compara
				if (Integer.parseInt(linea)>=5) {
					aprobados ++;
				}
			}			
			return aprobados;
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public double media() {
		double media=0;
		try(FileReader fr=new FileReader(RUTA);
				BufferedReader bf=new BufferedReader(fr)){
			String linea;
			int contador=0;
			while((linea=bf.readLine())!=null) {
				contador++;
				media+=Integer.parseInt(linea);
			}
			return media/contador;
		}catch(IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public ArrayList<Integer> recuperarNotas(){
		var notas=new ArrayList<Integer>();
		try (FileReader fr =new FileReader (RUTA);
				BufferedReader bf= new BufferedReader(fr);){
			String linea;
			while ((linea=bf.readLine())!=null) {  // lee la línea y al mismo tiempo la compara
				notas.add(Integer.parseInt(linea));
			}			
			return notas;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
