package br.com.dextra.exerciciosiniciais;

import java.util.ArrayList;
import java.util.List;

public class TestaDesicao {

	public boolean isVogal(String letra){
		boolean isVogal = false;
		switch(letra){
			case "A": isVogal = true; break;
			case "E": isVogal = true; break;
			case "I": isVogal = true; break;
			case "O": isVogal = true; break;	
			case "U": isVogal = true; break;
			default: return false;
		}
		return isVogal;
	}
	
	public void testaWhile(){
		int i = 0;
		while(i < 11){
			System.out.println(i);
			i++;
		}
	}
	
	
	public void testaDoWhile(){
		int i = 1;
		do{
			System.out.println("Com DOWHILE -> " + i);
			i++;
		}while(i < 11);
					
	}
	
	public void testaForEach(){
		List<Integer> listaDeInteiros = new ArrayList<Integer>();
		//adiciona elementos na lista
		for(int i = 0; i < 10; i++){
			listaDeInteiros.add(i);
		}
		//lendo elementos da lista
		for(Integer elemento : listaDeInteiros){
			System.out.println("Iteração FOREACH: " + elemento.intValue());
		}
	}
	
	
	public static void main(String[] args) {
		TestaDesicao teste = new TestaDesicao();
		//System.out.println(teste.isVogal("A") ? "É uma Vogal" : "Não é uma vogal");
		//teste.testaWhile();
		//teste.testaDoWhile();
		teste.testaForEach();
	}

}
