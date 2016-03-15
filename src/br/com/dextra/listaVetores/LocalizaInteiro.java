package br.com.dextra.listaVetores;

import java.util.Scanner;

public class LocalizaInteiro {

	private static Scanner teclado;
	private int[] numeroInteiros;
		
	public void preencheVetores(){
		numeroInteiros = new int[10];
		for(int i = 0; i < numeroInteiros.length; i++){
			numeroInteiros[i] = 1 + (int)(Math.random() * 25);
		}
	}
	
	public boolean procuraNumero(int num){
		boolean status = false;
		for(int i = 0; i < numeroInteiros.length; i++){
			if(numeroInteiros[i] == num){
				status = true;
				break;
			}else{
				status = false;
			}
		}
		return status;
	}
	
	private void imprimiNumerosSorteados(){
		int auxI = 0, auxJ = 0;
		
		for(int i = 0; i < numeroInteiros.length; i++){
			for(int j = i; j < numeroInteiros.length; j++){
				auxI = numeroInteiros[i];
				auxJ = numeroInteiros[j];
				if(auxJ < auxI){
					numeroInteiros[i] = auxJ;
					numeroInteiros[j] = auxI;
				}
			}
			System.out.print("[" + numeroInteiros[i] + "]");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalizaInteiro obj = new LocalizaInteiro();
		teclado = new Scanner(System.in);
		int num;
		obj.preencheVetores();
		System.out.println("Escolha entre 10 numeros sorteados na escala de 1 a 25:");
		num = teclado.nextInt();
		
		if(obj.procuraNumero(num))
			System.out.println("PARABENS SORTUDO!!!\nO numero: " + num + " está entre os sorteados.\n");
		else
			System.out.println("Você é um PÉ FRIO!!!\n");
		
		System.out.println("Os numeros sorteados foram:");
		obj.imprimiNumerosSorteados();
		
	}

}
