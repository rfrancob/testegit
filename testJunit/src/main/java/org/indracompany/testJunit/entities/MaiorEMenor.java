package org.indracompany.testJunit.entities;

public class MaiorEMenor {

	private Produto menor;
	private Produto maior;

	public void encontra(CarrinhoDeCompras carrinho){
		for(Produto produto : carrinho.getProdutos()){
			if(menor == null || produto.getCusto() < menor.getCusto()){
				menor = produto;
			} if (maior == null || produto.getCusto() > maior.getCusto()){
				maior = produto;
			}
		}
	}

	public Produto getMenor() {
		return menor;
	}

	public Produto getMaior(){
		return maior;
	}
	
}
