package com.cursojava.tablas.testing;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cursojava.tablas.service.EmpleadosService;

class EmpleadosServiceTest {
	EmpleadosService empleadosService;
	@BeforeEach
	void setUp() throws Exception {
		empleadosService=new EmpleadosService();
		empleadosService.altaEmpleado(1, "a");
		empleadosService.altaEmpleado(2, "b");
		empleadosService.altaEmpleado(3, "c");
	}

	@Test
	void testAltaEmpleado() {
		assertFalse(empleadosService.altaEmpleado(3, "d"));
		assertTrue(empleadosService.altaEmpleado(4, "d"));
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
