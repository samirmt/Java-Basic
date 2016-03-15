package br.com.dextra.exerciciosiniciais;

public class Retangulo {
	Ponto p1, p2;
	
	Retangulo (Ponto p1, Ponto p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	double area(){
		double largura = p2.coordX() - p1.coordX();
		double altura = p2.coordY() - p1.coordY();
		return largura * altura;
	}
	
	public static void main(String[] args){
		Ponto ponto1 = new Ponto(30.0, 10.0);
		Ponto ponto2 = new Ponto(60.0, 40.0);
		
		Retangulo retangulo = 
				new Retangulo(ponto1, ponto2);
		System.out.println("A AREA É -> " + retangulo.area());
	}
}
