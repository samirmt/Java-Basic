package br.com.dextra.exerciosiniciais;

import java.util.ArrayList;
import java.util.List;

public class TestaDecisao {

	public boolean isVogal(String letra){
		boolean isVogal = false;
		switch(letra) {
			case "A" : isVogal = true; break;
			case "E" : isVogal = true; break;
			case "I" : isVogal = true; break;
			case "O" : isVogal = true; break;
			case "U" : isVogal = true; break;
			default: return isVogal;
		}
		return isVogal;
	}
	
	public void testaWhile(){
		int i = 1;
		while(i <= 10){
			System.out.println(i);
			i++;
		}
	}
	
	public void testaDoWhile(){
		int i = 1;
		do{
			System.out.println("COM DO WHILE -> " + i);
			i++;
		}while(i >= 10);
	}
	
	public void testaForEach(){
		List<Integer> listaDeInteiros = new ArrayList<Integer>();
		
		//Adicionando Elementos na lista
		for(int i = 0; i < 11; i++){
			listaDeInteiros.add(new Integer(i));
		}
		
		//Lendo elementos da lista
		for(Integer elemento : listaDeInteiros){
			int intValue = elemento.intValue();
			if(intValue%2 != 0){
				continue;
			}
			System.out.println(
				"ITERAÇÃO VIA FOR-EACH ::: " + intValue 
			);
		}
		
	}
	
	public static void main(String args[]){
		TestaDecisao testeDecisaoObj = new TestaDecisao();
		System.out.println(
				testeDecisaoObj.isVogal("C") ? 
						"É UMA VOGAL" : 
							"NÃO É VOGAL");
		testeDecisaoObj.testaWhile();
		testeDecisaoObj.testaDoWhile();
		testeDecisaoObj.testaForEach();
	}
}
