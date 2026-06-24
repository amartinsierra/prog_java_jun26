package com.cursojava.tablas.service;

import java.util.HashMap;

import com.cursojava.tablas.model.Empleado;

public class EmpleadosService {
	private HashMap<Integer,Empleado> empleados=new HashMap<>();
	
	public boolean altaEmpleado(Integer codigo, Empleado empleado) {
		if(!empleados.containsKey(codigo)) {
			empleados.put(codigo, empleado);
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
	
	public Empleado[] nombres() {
		/*String[] resultado=new String[empleados.size()];
		int pos=0;
		for(Empleado n:empleados.values()) {
			resultado[pos]=n.getNombre();
			pos++;//para pasar a la siguiente posición del array
		}
		return resultado;	*/
		Empleado[] resultado=new Empleado[empleados.size()];
		int pos=0;
		for(Empleado n:empleados.values()) {
			resultado[pos]=n;
			pos++;//para pasar a la siguiente posición del array
		}
		return resultado;
		
	}
}
