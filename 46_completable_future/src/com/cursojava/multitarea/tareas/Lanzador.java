package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Lanzador {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Double> notas=new CopyOnWriteArrayList<>(List.of(3.5,7.8,4.1,2.9,8.0,5.6,7.3));
		
		//lanzamos tareas con CompletableFuture
		CompletableFuture<Double> c1=CompletableFuture.supplyAsync(new TareaMayor(notas));
		CompletableFuture<Double> c2=CompletableFuture.supplyAsync(new TareaMedia(notas));
		c1.whenCompleteAsync((r,e)->System.out.println("Nota más alta: "+r));
		c2.whenCompleteAsync((r,e)->System.out.println("Nota media: "+r));		
		
		for(int i=1;i<100;i++) {
			System.out.println("Haciendo cosas el main....");
			Thread.sleep(50);
		}
		
	}

}
