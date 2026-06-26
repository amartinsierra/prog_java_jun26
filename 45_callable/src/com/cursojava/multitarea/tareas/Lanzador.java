package com.cursojava.multitarea.tareas;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lanzador {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Double> notas=new CopyOnWriteArrayList<>(List.of(3.5,7.8,4.1,2.9,8.0,5.6,7.3));
		ExecutorService executor=Executors.newCachedThreadPool();
		//control de tareas mediante Future
		Future f1=executor.submit(new TareaMayor(notas));
		Future f2=executor.submit(new TareaMedia(notas));
		executor.shutdown();
		while(!f1.isDone()||!f2.isDone()) {
			System.out.println("Haciendo cosas el main....");
			Thread.sleep(50);
		}
		System.out.println("Nota media: "+f2.get());
		System.out.println("Nota más alta: "+f1.get());
	}

}
