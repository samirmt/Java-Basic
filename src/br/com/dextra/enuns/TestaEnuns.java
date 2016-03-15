package br.com.dextra.enuns;

public class TestaEnuns {

	public static void main(String[] args) {
		
		System.out.println("A PEÇA É: " + TipoPecaXadrez.returnPeso(3));
		System.out.println("Peso do Bispo: " + TipoPecaXadrez.BISPO.getPeso());
	}

}
