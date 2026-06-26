package com.cursojava.multitarea.main;

import com.cursojava.multitarea.tareas.TablaMultiplicar;

public class Lanzador {

	public static void main(String[] args) {
		
	
		Thread t1=new Thread(new TablaMultiplicar(4));
		Thread t2=new Thread(new TablaMultiplicar(7));
		Thread t3=new Thread(new TablaMultiplicar(9));
		t1.start();
		t2.start();
		t3.start();
	}

}
