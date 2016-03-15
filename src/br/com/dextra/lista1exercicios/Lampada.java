package br.com.dextra.lista1exercicios;

public class Lampada {
	private Boolean ligada  = true;
	
	private Boolean liga(){
		return this.ligada = true;
	}
	
	private Boolean desliga(){
		return this.ligada = false;
	}
	
	private String observa(){
		String status = "";
		if (this.ligada) status = "Ligada";
		else status = "Desligada";
			
		return status;
		
	}
	
	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		Lampada lamp2 = new Lampada();
		lamp1.liga();
		lamp2.desliga();
		System.out.println("A Lampada1 está: " + lamp1.observa());
		System.out.println("A Lampada2 está " + lamp2.observa());
	}

}
