package br.com.caelum.conta.test;

public class Main {

	public static void main(String[] args) {

		String s = "Socorram-me, subi no ônibus em Marrocos";

		String[] s1 = s.split(" ");

		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.println(s1[i] + " ");
		}

		System.out.print("\t");
		StringBuilder invertido = new StringBuilder(s).reverse();
		System.out.println(invertido);
		
		System.out.println("=====================================================");

		String numero = "762";
		System.out.println("Imprimindo a string: " + numero);

		int resultado = converteParaInt(numero);
		System.out.println("Imprimindo o int: " + resultado);
	}

	private static int converteParaInt(String numero) {
		int resultado = 0;
		while (numero.length() > 0) {
			char algarismo = numero.charAt(0);
			System.out.println(algarismo);
			resultado = resultado * 10 + (algarismo - '0');
			System.out.println(resultado);
			numero = numero.substring(1);
			System.out.println(numero);
		}
		return resultado;

	}

}
