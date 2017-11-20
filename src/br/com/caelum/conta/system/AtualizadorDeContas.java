package br.com.caelum.conta.system;

import br.com.caelum.conta.model.Conta;

public class AtualizadorDeContas {

	private double saldoTotal;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta conta) {
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("Saldo atualizado: " + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
}
