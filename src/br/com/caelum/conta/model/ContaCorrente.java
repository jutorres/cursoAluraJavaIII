package br.com.caelum.conta.model;

import br.com.caelum.conta.system.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	
	public double atualiza(double taxa) {
		return saldo += saldo * (taxa * 2);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
