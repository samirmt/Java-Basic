package br.com.dextra.listaVetores;

public class InverteVetorString {
	String[] vetorOriginal = {"A", "B", "C", "D", "E", "F", "G"};
	String[] vetorCopia = new String[vetorOriginal.length];//deixar o vetorCopia com o mesmo tamanho do original
	
	public void copiaVetor(){
				
		for(int i = 0; i < vetorOriginal.length; i++){
			vetorCopia[i] = vetorOriginal[i];
		}
	}
	
	public void inverteVetor(){
		String guardaPalavra = "";
		int auxPos = vetorOriginal.length - 1;
		int i = 0;
		
		while (i < auxPos){
			guardaPalavra = vetorOriginal[i];
			vetorOriginal[i] = vetorOriginal[auxPos];
			vetorOriginal[auxPos] = guardaPalavra;
			auxPos--;
			i++;
		}
	}
	
	public void imprimiVetor(int opt){
		
		switch(opt){
			case 1://vetor original
				for(int i = 0; i < vetorOriginal.length; i++){
					System.out.printf("[ " + vetorOriginal[i] + " ]" );
				}
				break;
			case 2://vetor copia
				for(int i = 0; i < vetorCopia.length; i++){
					System.out.printf("[ " + vetorCopia[i] + " ]" );
				}
				break;
			case 3://vetor original invertido
				for(int i = 0; i < vetorOriginal.length; i++){
					System.out.printf("[ " + vetorOriginal[i] + " ]" );
				}
				break;
		}
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InverteVetorString obj = new InverteVetorString();
		
		obj.copiaVetor();
		System.out.printf(" Vetor Original: ");
		obj.imprimiVetor(1);
		System.out.println("\n");
		System.out.printf("    Vetor Copia: ");
		obj.imprimiVetor(2);
		System.out.println("\n");
		obj.inverteVetor();
		System.out.printf("Vetor Invertido: ");
		obj.imprimiVetor(3);
	}

}
