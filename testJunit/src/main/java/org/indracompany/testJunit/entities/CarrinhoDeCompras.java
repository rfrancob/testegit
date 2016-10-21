package org.indracompany.testJunit.entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> carrinho;
	
	public void adiciona(Produto produto){
		carrinho.add(produto);
	}

	public List<Produto> getProdutos(){
		return this.carrinho;
	}

	public CarrinhoDeCompras() {
		super();
		this.carrinho =  new ArrayList<Produto>();
	}

	
}
