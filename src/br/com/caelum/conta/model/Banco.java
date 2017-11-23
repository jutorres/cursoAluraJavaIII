package br.com.caelum.conta.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> indexName = new HashMap<>();
	
	public void adiciona(Conta conta) {
		contas.add(conta);
		indexName.put(conta.getNome(), conta);
	}
	
	public Conta pega(int numero) {
		return contas.get(numero);
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return indexName.get(nome);
		}
	}
	
