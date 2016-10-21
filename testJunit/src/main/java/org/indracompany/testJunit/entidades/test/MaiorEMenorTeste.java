package org.indracompany.testJunit.entidades.test;

import org.indracompany.testJunit.entities.CarrinhoDeCompras;
import org.indracompany.testJunit.entities.MaiorEMenor;
import org.indracompany.testJunit.entities.Produto;
import org.junit.Assert;
import org.junit.Test;

public class MaiorEMenorTeste {
	
	@Test
	public void ordemDecrscente(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		Assert.assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}
}