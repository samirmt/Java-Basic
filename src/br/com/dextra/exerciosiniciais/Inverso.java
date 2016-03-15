package br.com.dextra.exerciosiniciais;

/**
 * 
 * @author java02
 *
 */
public class Inverso {
	
	public String invertePalavra(String palavra){
		String palavraInvertida = "";
		//Varrendo string original de trás para frente
		for(int i = palavra.length()-1; i>=0; i--){
			palavraInvertida += palavra.charAt(i); 
		}
		return palavraInvertida;
	}
	
	public static void main(String[] args){
		//Recebo uma palavra via parâmetro na linha de comando
		String palavra = args[0];
		
		//Crio um objeto novo
		Inverso objetoInverso = new Inverso();
		String stringInvertida = objetoInverso.invertePalavra(palavra);
		System.out.println("String INVERTIDA ->> " + stringInvertida);
	}

}
