package com.cursojava.streams;

import java.util.List;
import java.util.Optional;

import com.cursojava.model.Ciudad;

interface CiudadesService {
    Optional<Ciudad> obtenerCiudadMasCalurosa();
    double obtenerTemperaturaMedia();
    List<Ciudad> obtenerCiudadesOrdenadasPorHabitantesAsc();
    List<Ciudad> obtenerCiudadesConPoblacionSuperiorA(int poblacionMinima);
}
