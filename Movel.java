package Projeto.de.Revis.o.model.domain;

public class Movel {
	
	private boolean roda;
	private float tamanho;
	private String descricao;
	private int qtdeGaveta;
	
	public float calcularValorVenda() {
		return (roda ? 100 : 0) + (tamanho * 10) + (qtdeGaveta * 20);
	}
	public void impressao() {
		System.out.println("O móvel "+ descricao +" custa R$" + calcularValorVenda());
	}
	public boolean isRoda() {
		return roda;
	}
	public void setRoda(boolean roda) {
		this.roda = roda;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdeGaveta() {
		return qtdeGaveta;
	}
	public void setQtdeGaveta(int qtdeGaveta) {
		this.qtdeGaveta = qtdeGaveta;
	}

}
