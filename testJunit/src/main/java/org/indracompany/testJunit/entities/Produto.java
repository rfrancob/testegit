package org.indracompany.testJunit.entities;

public class Produto {
	private String nome;
	private double custo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public Produto(String nome, double custo) {
		super();
		this.nome = nome;
		this.custo = custo;
	}
}
