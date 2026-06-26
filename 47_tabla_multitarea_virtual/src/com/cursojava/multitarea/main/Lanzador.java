package com.cursojava.multitarea.main;

import com.cursojava.multitarea.tareas.TablaMultiplicar;

public class Lanzador {

	public static void main(String[] args) throws InterruptedException {
		
	
		Thread.startVirtualThread(new TablaMultiplicar(4));
		Thread.startVirtualThread(new TablaMultiplicar(7));
		Thread.startVirtualThread(new TablaMultiplicar(9));
		Thread.sleep(5000);
	}

}
