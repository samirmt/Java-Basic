package br.com.dextra.lista1;

public class UsaQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println("Q1 - Area: " + q1.area() + "  Perimetro: " + q1.perimetro());
		System.out.println("Q2 - Area: " + q2.area() + " Perimetro: " + q2.perimetro());
		System.out.println("Q3 - Area: " + q3.area() + " Perimetro: " + q3.perimetro());
	}

}
