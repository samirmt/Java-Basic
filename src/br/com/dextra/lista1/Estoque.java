package br.com.dextra.lista1;

public class Estoque {
	private String nome;
	private int qtdAtual, qtdMinima;
	
	Estoque(){
		
	}
	Estoque(String nome, int qtdAtual, int qtdMinima){
		this.nome = nome;
		if(qtdAtual >= 0) this.qtdAtual = qtdAtual;
		if(qtdMinima >= 0) this.qtdMinima = qtdMinima;
	}
	
	public void mudarNome(String nome){
		this.nome = nome;
	}
	public void mudarQtdMinima(int qtdMinima){
		this.qtdMinima = qtdMinima;
	}
	public void repor(int qtd){
		this.qtdAtual += qtd;
	}
	public void darBaixa(int qtd){
		this.qtdAtual -= qtd;
		if (this.qtdAtual < 0)
			this.qtdAtual = 0;
	}
	String mostra(){
		return this.nome + " - Qtd Atual:" + this.qtdAtual + " - QtdMinima:" + this.qtdMinima;
	}
	public boolean precisaRepor(){
		if (this.qtdAtual <= this.qtdMinima)
			return true;
		else
			return false;
	}
	
	
}
