package br.com.caelum.conta.test;

import java.util.HashSet;

import br.com.caelum.conta.model.Conta;
import br.com.caelum.conta.model.ContaCorrente;

public class TestaHashDeContas {
	
	public static void main(String[] args) {
		
		HashSet<Conta> contas = new HashSet<>();
		ContaCorrente c1 = new ContaCorrente(100, "Joao");
		ContaCorrente c2 = new ContaCorrente(100, "Mario");
		ContaCorrente c3 = new ContaCorrente(101, "Zezinho");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Total de contas no Hashet: " + contas.size());
		
	}

}
