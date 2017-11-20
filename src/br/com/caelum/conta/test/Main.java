package br.com.caelum.conta.test;

import br.com.caelum.conta.exception.ValorInvalidoException;
import br.com.caelum.conta.model.Conta;
import br.com.caelum.conta.model.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		
		try {
            cc.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
	}

}
