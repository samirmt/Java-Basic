package br.com.dextra.listaPolimorfismo;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(1000);
		gerenciador.adiciona(contaCorrente);
		gerenciador.adiciona(seguroDeVida);
		System.out.println("Total de Impostos - " + gerenciador.getTotal());
		
	}

}
