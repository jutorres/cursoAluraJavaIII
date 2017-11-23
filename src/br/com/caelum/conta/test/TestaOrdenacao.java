package br.com.caelum.conta.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.caelum.conta.model.Conta;
import br.com.caelum.conta.model.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Random random = new Random();
		
		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Caio");
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		
		ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Jose");
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		
		ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Victor");
	    c3.deposita(random.nextInt(10000) + random.nextDouble());
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		Collections.sort(contas);
		
		System.out.println(contas);
		
		for(Conta c: contas) {
			System.out.println(c);
		}
	}
}
