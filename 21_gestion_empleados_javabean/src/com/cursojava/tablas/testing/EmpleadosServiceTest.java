package com.cursojava.tablas.testing;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cursojava.tablas.model.Empleado;
import com.cursojava.tablas.service.EmpleadosService;

class EmpleadosServiceTest {
	EmpleadosService empleadosService;
	@BeforeEach
	void setUp() throws Exception {
		empleadosService=new EmpleadosService();
		empleadosService.altaEmpleado(1, new Empleado(1,"a",333,"dep1"));
		empleadosService.altaEmpleado(2, new Empleado(2,"b",444,"dep2"));
		empleadosService.altaEmpleado(3, new Empleado(3,"c",666,"dep3"));
	}

	@Test
	void testAltaEmpleado() {
		assertFalse(empleadosService.altaEmpleado(3, new Empleado(3,"dfdfs",2222,"eeee")));
		assertTrue(empleadosService.altaEmpleado(4, new Empleado(4,"dfdfs",2222,"eeee")));
	}

	@Test
	void testEliminarEmpleado() {
		assertFalse(empleadosService.eliminarEmpleado(5));
		assertTrue(empleadosService.eliminarEmpleado(2));
	}

	@Test
	void testNombres() {
		assertEquals(3,empleadosService.nombres().length);
	}

}
