package br.edu.softEngineer.composite.report;

import java.util.ArrayList;
import java.util.List;

public class Grupamento extends Lancamento{
	
	private List<Lancamento> lancamentos = new ArrayList<>();
	
	public Grupamento(String nome) {
		super(nome);
	}

	@Override
	public float getValor() {
		float valor = 0;
		for(Lancamento lancamento: lancamentos){
			valor+=lancamento.getValor();
		}
		return valor;
	}

	@Override
	public void imprimir(String prefix) {
		System.out.println(prefix + getNome());
		for(Lancamento lancamento: lancamentos){
			lancamento.imprimir(prefix + "\t");
		}
		System.out.println(prefix + "Total: " + getValor());
	}
	
	public void addLancamento(Lancamento lancamento){
		lancamentos.add(lancamento);
	}

}
