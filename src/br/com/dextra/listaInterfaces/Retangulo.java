package br.com.dextra.listaInterfaces;

public class Retangulo implements AreaCalculavel {
	private double altura, largura;

	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double calculaArea() {
		return altura * largura;
	}
}
