package br.com.dextra.listaPolimorfismo;

public class SeguroDeVida implements Tributavel {
	
	private static final double TAXA_FIXA = 42;
	
	@Override
	public double calculaTributos() {
		return TAXA_FIXA;
	}

}
