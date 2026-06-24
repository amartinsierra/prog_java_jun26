package com.cursojava.tablas.view;

import com.cursojava.tablas.model.Empleado;
import com.cursojava.tablas.service.EmpleadosService;

public class Presentacion {

	public static void main(String[] args) {
		var empleadosService=new EmpleadosService();
		empleadosService.altaEmpleado(1, new Empleado(1,"e1",333,"d1"));
		empleadosService.altaEmpleado(2, new Empleado(2,"e2",342,"d2"));
		empleadosService.altaEmpleado(3, new Empleado(3,"e3",116,"d2"));
		
		for(Empleado e:empleadosService.nombres()) {
			System.out.println(e.toString());
		}
	}

}
