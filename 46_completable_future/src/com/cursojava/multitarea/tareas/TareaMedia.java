package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.function.Supplier;

public class TareaMedia implements Supplier<Double>{
	List<Double> notas;
	public TareaMedia(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public Double get() {
		double media=0;
		for(Double d:notas) {
			media+=d;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return media/notas.size();
	}

}
