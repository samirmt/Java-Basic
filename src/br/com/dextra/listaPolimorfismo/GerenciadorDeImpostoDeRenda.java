package br.com.dextra.listaPolimorfismo;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	  void adiciona(Tributavel t) {
	    System.out.println("Adicionando o Tributável a Lista");

	    this.total +=  t.calculaTributos();
	  }

	  public double getTotal() {
	    return this.total;
	  }
	
}
