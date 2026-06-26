package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.concurrent.Callable;

public class TareaMedia implements Callable<Double>{
	List<Double> notas;
	public TareaMedia(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public Double call() throws Exception {
		double media=0;
		for(Double d:notas) {
			media+=d;
			Thread.sleep(200);
		}
		return media/notas.size();
	}

}
