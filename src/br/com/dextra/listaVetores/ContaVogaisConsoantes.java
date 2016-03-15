package br.com.dextra.listaVetores;

public class ContaVogaisConsoantes {
	
	char[] vogais = {
						'a', 'e', 'i', 'o', 'u',
						'A', 'E', 'I', 'O', 'U'
	};
	char[] consoantes = {
						'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
						'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
						'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
						'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',
	};
	
	
	
	char[] vetor = {'a', 'n', 't', 'i', 'c', 'o', 'n', 's', 't', 'i', 't', 'u', 'c',
						'i', 'o', 'n', 'a', 'l', 'i', 's', 's', 'i', 'm', 'a', 'm', 'e', 'n', 't', 'e'};
	int contVogal = 0;
	int contConsoante = 0;
	String armVogais = "";
	String armConsoantes = "";
	
	public void funcaoConta(){
		for(int i = 0; i < vetor.length; i++){
			for(int j = 0; j < vogais.length; j++){
				if(vetor[i] == vogais[j]){
					armVogais += vetor[i];
					contVogal++;
				}
			}
			for(int k = 0; k < consoantes.length; k++){
					if(vetor[i] == consoantes[k]){
						armConsoantes += vetor[i];
						contConsoante++;
				}
			}
		}
		
		System.out.println("Qtd Vogais: " + contVogal + " - " + armVogais +
				"\nQtd Consoantes: " + contConsoante + " - " + armConsoantes);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaVogaisConsoantes obj = new ContaVogaisConsoantes();
		obj.funcaoConta();
	}

}
