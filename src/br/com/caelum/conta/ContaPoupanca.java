package br.com.caelum.conta;

public class ContaPoupanca extends Conta{

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
}
