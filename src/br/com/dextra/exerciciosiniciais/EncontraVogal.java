package br.com.dextra.exerciciosiniciais;

import java.util.Scanner;

public class EncontraVogal {

	private static Scanner teclado;
	public String procuraVogal(String palavra){
		String vogais = "";
		
		for(int i = 0; i < palavra.length(); i++){
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u'){
				vogais += palavra.charAt(i);
			}
		}
		return vogais;
	}
	public static void main(String[] args) {
		EncontraVogal vogais = new EncontraVogal();
		teclado = new Scanner(System.in);
		String palavra = "";
		System.out.println("Digite uma palavra:");
		palavra = teclado.nextLine();
		System.out.println("Vogais: " + vogais.procuraVogal(palavra.toLowerCase()));
	}

}
