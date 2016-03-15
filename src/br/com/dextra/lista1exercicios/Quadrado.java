package br.com.dextra.lista1exercicios;

public class Quadrado {
	double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	public double area(){
		return this.lado * this.lado;
	}
	public double perimetro(){
		return 4 * this.lado;
	}
	
}
