package br.com.caelum.conta.model;

import br.com.caelum.conta.exception.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	private int numero;
	private String nome;
	
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
	
	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo: R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.nome.equals(outraConta.nome);
	}
}
