package br.com.dextra.listaInterfaces;

public class Quadrado implements AreaCalculavel{
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

}
