package com.cursojava.multitrea;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TareaLista {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> lista=new CopyOnWriteArrayList<>();//new ArrayList<>();
		/*clasica
		new Thread(()->IntStream.rangeClosed(1, 1000).forEach(n->lista.add(n))).start();
		new Thread(()->IntStream.rangeClosed(1001, 2000).forEach(n->lista.add(n))).start();
		*/
		//nueva
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.submit(()->IntStream.rangeClosed(1, 1000).forEach(n->lista.add(n)));
		executor.submit(()->IntStream.rangeClosed(1001, 2000).forEach(n->lista.add(n)));
		executor.shutdown();
		Thread.sleep(10000);
		System.out.println(lista.size());

	}

}
