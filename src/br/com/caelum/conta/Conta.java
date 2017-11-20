package br.com.caelum.conta;

abstract class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
            this.saldo += valor;        
        }    
	}
	
	public double saca(double valor) {
		return this.saldo -= valor;
	}
	
	public abstract double atualiza(double taxa);
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
