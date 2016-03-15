package br.com.dextra.listaInterfaces;

public class Circulo implements AreaCalculavel {

	double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	@Override
	public double calculaArea() {
		return Math.PI * (2*raio);
	}

}
