package br.com.dextra.listaInterfaces;

public class TestaInterfaces {

	public void imprimiArea(AreaCalculavel formaGeometrica){
		System.out.println("A Area Calculada é: " + formaGeometrica.calculaArea());
	}
	
	public static void main(String[] args) {
		TestaInterfaces obj = new TestaInterfaces();
		
		AreaCalculavel qd = new Quadrado(2);
		AreaCalculavel rt = new Retangulo(4,2);
		AreaCalculavel ci = new Circulo(2);
		
		obj.imprimiArea(qd);
		obj.imprimiArea(rt);
		obj.imprimiArea(ci);
		
	}

}
