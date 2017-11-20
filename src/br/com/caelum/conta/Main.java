package br.com.caelum.conta;

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
