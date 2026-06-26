package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class TareaMayor implements Supplier<Double>{
	List<Double> notas;
	public TareaMayor(List<Double> notas) {
		this.notas = notas;
	}
	@Override
	public Double get()  {
		double mayor=notas.get(0);
		for(Double d:notas) {
			if(d>mayor) {
				mayor=d;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mayor;
	}

}
