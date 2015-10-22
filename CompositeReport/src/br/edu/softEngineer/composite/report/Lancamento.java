package br.edu.softEngineer.composite.report;

public abstract class Lancamento {

	private String nome;
	public Lancamento(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimir(){
		imprimir("");
	}
	
	public abstract float getValor();
	public abstract void imprimir(String prefix);
	
}
