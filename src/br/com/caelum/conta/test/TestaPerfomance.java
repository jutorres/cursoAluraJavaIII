package br.com.caelum.conta.test;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> test = new HashSet<Integer>();
		long initial = System.currentTimeMillis();
		
		int total = 30000;
		
		for(int i = 0; i < total; i++) {
			test.add(i);
		}
		
		for(int i = 0; i < total; i++) {
			test.contains(i);
		}
		
		long end = System.currentTimeMillis();
		long time = end - initial;
		System.out.println("Tempo gasto: " + time);
	}

}
