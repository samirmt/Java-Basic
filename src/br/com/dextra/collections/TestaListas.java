package br.com.dextra.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaListas {

	
	public void imprimiLista(Collection<Integer> lista){
		for(Integer elemento : lista){
			System.out.println(elemento);
		}
	}
	public static void main(String[] args) {
		TestaListas obj = new TestaListas();
		List<Integer> listaDeInteiros = new ArrayList<Integer>();
		
		for(int i = 1; i < 7; i++){
			listaDeInteiros.add(i);
		}
		
		
		//ordenação
		Collections.sort(listaDeInteiros, new Comparator<Integer>(){
				
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o2 > o1){
					return 1;
				}else
					if(o1 > 02){
						return -1;
					}
				
				return 0;
			}
			
		});
		System.out.println(listaDeInteiros.size()-1);		
		//obj.imprimiLista(listaDeInteiros);
		
		Set<Integer> setDeInteiros = new HashSet<Integer>();
		
		setDeInteiros.add(1);
		setDeInteiros.add(2);
		setDeInteiros.add(3);
		setDeInteiros.add(4);
		setDeInteiros.add(5);
		setDeInteiros.add(6);
		setDeInteiros.add(6);
		setDeInteiros.add(6);
		
		
		
		//obj.imprimiLista(setDeInteiros);
		
		
		}

}
