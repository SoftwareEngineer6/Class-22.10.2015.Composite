package br.edu.softEngineer.composite.report;

public class Runner {

	public static void main(String[] args) {
		Receita salario = new Receita("Salario", 800);
		Receita free = new Receita("FreeLancer", 300);
		Despesa cerveja = new Despesa("Cerveja", 200);
		Despesa gasolina = new Despesa("Gasolina", 200);
		Despesa DP = new Despesa("DP", 400);
		
		Grupamento pro = new Grupamento("Profissional");
		pro.addLancamento(DP);
		pro.addLancamento(salario);
		pro.addLancamento(free);
		
		Grupamento pessoal = new Grupamento("Pessoal");
		pessoal.addLancamento(cerveja);
		pessoal.addLancamento(gasolina);
		
		Grupamento geral = new Grupamento("Geral");
		geral.addLancamento(pro);
		geral.addLancamento(pessoal);
		
		geral.imprimir();
		

	}

}
