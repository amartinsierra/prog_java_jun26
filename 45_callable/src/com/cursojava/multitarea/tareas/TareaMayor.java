package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.concurrent.Callable;

public class TareaMayor implements Callable<Double>{
	List<Double> notas;
	public TareaMayor(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public Double call() throws Exception {
		double mayor=notas.get(0);
		for(Double d:notas) {
			if(d>mayor) {
				mayor=d;
			}
			Thread.sleep(200);
		}
		return mayor;
	}

}
