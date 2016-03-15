package br.com.dextra.exerciciosiniciais;

public class Intervalo {

	public static void main(String[] args) {
		int i ;
		int r;
		for(i = 299; i > 100; i--){
			r = i % 2;
			if (r != 0){
				System.out.println(i);
			}//fim if
		}//fim for

	}

}
