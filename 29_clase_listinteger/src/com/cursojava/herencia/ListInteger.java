package com.cursojava.herencia;

import java.util.ArrayList;

public class ListInteger extends ArrayList<Integer>{
	public int sum() {
		int suma=0;
		/*for(int i=0;i<size();i++) {
			suma+=get(i);
		}*/
		for(int n:this) {
			suma+=n;
		}
		return suma;
	}
	public double average() {
		return sum()/size();
	}
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	
	
}
