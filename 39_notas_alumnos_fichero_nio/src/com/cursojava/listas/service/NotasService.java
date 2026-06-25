package com.cursojava.listas.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class NotasService {
	final Path RUTA=Path.of("c:\\temp\\notas.txt");
	public NotasService() {
		//comprobamos si existe el fichero y si no existe se crea
		
		if(!Files.exists(RUTA)) {
			try {
				Files.createFile(RUTA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void guardarNota(int nota) {
		try{
			Files.writeString(RUTA, String.valueOf(nota)+System.lineSeparator(), StandardOpenOption.APPEND);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public int aprobados() {
		
		try {
			return (int)Files.lines(RUTA) //Stream<String>
					.filter(c->Integer.parseInt(c)>=5)
					.count();
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public double media() {
		
		try{
			return Files.lines(RUTA)
					.collect(Collectors.averagingDouble(s->Double.parseDouble(s)));
		}catch(IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public List<Integer> recuperarNotas(){
		
		try {
			return Files.lines(RUTA)
					.map(s->Integer.parseInt(s))
					.toList();
		} catch (IOException ex) {
			ex.printStackTrace();
			return List.of();
		}
	}
}
