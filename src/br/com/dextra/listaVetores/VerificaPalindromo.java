package br.com.dextra.listaVetores;



public class VerificaPalindromo {
	private char[] vetor = {'x', 'y', 'z', 'y', 's'};
	
	int posEsq = 0;
	int posDir = vetor.length -1;	
	
	public boolean testaPalindromo(){
		boolean isPalindromo = false;
		
		for(int i = vetor.length -1; i >=0; i--){
			if(vetor[posEsq] == vetor[posDir]){
				posEsq++;
				posDir--;
				isPalindromo = true;
			}else{
				isPalindromo = false;
			}
		}
		return isPalindromo;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VerificaPalindromo obj = new VerificaPalindromo();
		boolean result = obj.testaPalindromo();
		
		if(result){
			System.out.printf("O VETOR é um PALINDROMO");
		}else{
			System.out.printf("O VETOR não é um PALINDROMO");
		}
	}

}
