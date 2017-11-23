package br.com.caelum.conta.model;

import br.com.caelum.conta.exception.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int numero;
	private String nome;
	

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
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
	
	
	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo: R$" + this.saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	public int compareTo(Conta outra) {
		return this.getNumero() - outra.getNumero();
	}
}
