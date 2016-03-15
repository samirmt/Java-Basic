package br.com.dextra.listaVetores;

public class OrdenarCrescente {
	
	
	public int[] ordenaArray(int[] arrayDeInteiros){
		int auxI = 0;
		int auxJ = 0;
		for(int i = 0; i < arrayDeInteiros.length; i++){
			for(int j = i; j < arrayDeInteiros.length; j++){
				auxJ = arrayDeInteiros[j];
				auxI = arrayDeInteiros[i];
				if(auxJ < auxI){
					arrayDeInteiros[i] = auxJ;
					arrayDeInteiros[j] = auxI;
				}
			}
			
		}
		return arrayDeInteiros;
	}
	
	public void imprimiArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println("Posição[" + i + "]-> " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		OrdenarCrescente obj = new OrdenarCrescente();
		int[] meuArray = {6, 7, 3, 4};
		int[] result = obj.ordenaArray(meuArray);
		
		obj.imprimiArray(result);	
		
		
	}

}
