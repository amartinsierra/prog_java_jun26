package com.cursojava.tablas.service;

import java.util.HashMap;

public class EmpleadosService {
	private HashMap<Integer,String> empleados=new HashMap<>();
	
	public boolean altaEmpleado(Integer codigo, String nombre) {
		if(!empleados.containsKey(codigo)) {
			empleados.put(codigo, nombre);
			return true;
		}
		return false;
	}
	
	public boolean eliminarEmpleado(Integer codigo) {
		if(empleados.containsKey(codigo)) {
			empleados.remove(codigo);
			return true;
		}
		return false;
	}
	
	public String[] nombres() {
		String[] resultado=new String[empleados.size()];
		int pos=0;
		for(String n:empleados.values()) {
			resultado[pos]=n;
			pos++;//para pasar a la siguiente posición del array
		}
		return resultado;	
	}
}
