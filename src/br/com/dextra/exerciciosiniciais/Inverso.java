package br.com.dextra.exerciciosiniciais;

import java.util.Scanner;

public class Inverso {

	private static Scanner teclado;

	public String retornaInverso(String palavra){
		String invertida = "";
		for(int i = palavra.length()-1 ; i >= 0; i--){
			invertida += palavra.charAt(i);
		}	
		
		return invertida.toUpperCase();
	}
	
	public static void main(String[] args) {
		Inverso in = new Inverso();
		teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine();
		String invertida;
		invertida = in.retornaInverso(palavra);
		
		System.out.println("Palavra Original: " + palavra + "\nPalavra Invertida: " + invertida);

	}

}
