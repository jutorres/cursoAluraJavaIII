package br.com.caelum.conta;

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
