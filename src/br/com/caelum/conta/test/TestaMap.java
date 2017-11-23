package br.com.caelum.conta.test;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.conta.model.Conta;
import br.com.caelum.conta.model.ContaCorrente;

public class TestaMap {
	
	public static void main(String[] args) {
		
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Conta c1 = new ContaCorrente(100, "Diretor");
		c1.deposita(500.0);

		Conta c2 = new ContaCorrente(200, "Gerente");
		c2.deposita(500.0);
		
		contas.put("Diretor", c1);
		contas.put("Gerente", c2);
		
		Conta contaDoDiretor = contas.get("Diretor");
        System.out.println(contaDoDiretor.getSaldo());
	
	}
	

}
