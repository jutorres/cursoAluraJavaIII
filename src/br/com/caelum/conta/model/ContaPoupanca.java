package br.com.caelum.conta.model;

public class ContaPoupanca extends Conta {
	

	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
	}

	public double atualiza(double taxa) {
		return saldo += saldo * (taxa * 3);
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
            throw new IllegalArgumentException();
        } else {
            this.saldo += valor - 0.1;        
        }    
	}
	
	@Override
	public int compareTo(Conta outra) {
		return this.getNome().compareTo(outra.getNome());
	}

	
}
