package br.com.dextra.listaVetores;

public class SomaInteiros {
	
	public int somaArray(int[] arrayDeInteiros){
		int	soma = 0;
		for(int i = 0; i < arrayDeInteiros.length; i++){
			soma += arrayDeInteiros[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		SomaInteiros obj = new SomaInteiros();
		int[] meuArray = {1, 2, 3, 4, 5 ,6, 7, 8, 9};
		int soma = obj.somaArray(meuArray);
		System.out.println("SOMA DOS ELEMENTOS -> " + soma);
	}
}
