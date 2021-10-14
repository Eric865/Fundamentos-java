package Projeto.de.Revis.o.model.testes;

import Projeto.de.Revis.o.model.domain.Movel;

public class MovelTeste {
	public static void main(String[] args) {
		//(0) + (2000) + (360) = 2360
		Movel gaveteiro = new Movel();
		gaveteiro.setDescricao("Gaveteiro Luxo");
		gaveteiro.setQtdeGaveta(18);
		gaveteiro.setRoda(false);
		gaveteiro.setTamanho(200);
		System.out.println("Valor de venda" +gaveteiro.calcularValorVenda());
		
		//(100) + (1000) + (0) = 1100;
		Movel rack = new Movel();
		rack.setDescricao("Mega Rack");
		rack.setQtdeGaveta(0);
		rack.setRoda(true);
		rack.setTamanho(100);
	    rack.impressao();
	}

}
