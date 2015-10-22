package br.edu.softEngineer.composite.report;

public class Despesa extends Lancamento {

	private float valor;
	
	public Despesa(String nome, float valor) {
		super(nome);
		this.valor = valor;
	}
	
	@Override
	public float getValor() {
		return -valor;
	}

	@Override
	public void imprimir(String prefix) {
		System.out.println(prefix + getNome() + ": -" + valor);
		
	}
	

}
