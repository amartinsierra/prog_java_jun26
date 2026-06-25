package com.cursojava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cursojava.model.Ciudad;

public class CiudadesServiceImpl implements CiudadesService {
	List<Ciudad> ciudades = List.of(
            new Ciudad("Madrid", 3266000, 15.5),
            new Ciudad("Barcelona", 1637000, 17.1),
            new Ciudad("Valencia", 792000, 18.3),
            new Ciudad("Sevilla", 684000, 20.2),
            new Ciudad("Zaragoza", 675000, 14.8),
            new Ciudad("Bilbao", 345000, 13.9),
            new Ciudad("Málaga", 578000, 19.5),
            new Ciudad("Murcia", 460000, 18.7),
            new Ciudad("Palma", 422000, 17.8),
            new Ciudad("Valladolid", 298000, 12.3)
        );
	@Override
	public Optional<Ciudad> obtenerCiudadMasCalurosa() {
		return ciudades.stream()
                .max(Comparator.comparingDouble(Ciudad::temperatura));
	}

	@Override
	public double obtenerTemperaturaMedia() {
		/*return ciudades.stream()
                .mapToDouble(Ciudad::temperatura)
                .average()
                .orElse(0.0);*/
		return ciudades.stream()
				.collect(Collectors.averagingDouble(Ciudad::temperatura));
	}

	@Override
	public List<Ciudad> obtenerCiudadesOrdenadasPorHabitantesAsc() {
		return ciudades.stream()
                .sorted(Comparator.comparingInt(Ciudad::habitantes))
                .toList();
	}

	@Override
	public List<Ciudad> obtenerCiudadesConPoblacionSuperiorA(int poblacionMinima) {
		return ciudades.stream()
                .filter(c -> c.habitantes() > poblacionMinima)
                .toList();
	}

	

}
