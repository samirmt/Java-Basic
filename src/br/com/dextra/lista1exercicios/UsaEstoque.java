package br.com.dextra.lista1exercicios;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
		Estoque estoque3 = new Estoque("Mouse Optico", 6, 2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(3);
		
		System.out.println(estoque1.precisaRepor());
		System.out.println(estoque2.precisaRepor());
		System.out.println(estoque3.precisaRepor());
		System.out.println("\n");
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		
	}

}
