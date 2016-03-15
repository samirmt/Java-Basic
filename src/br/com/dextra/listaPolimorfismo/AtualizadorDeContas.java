package br.com.dextra.listaPolimorfismo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}


	public void roda(Conta c){
		System.out.println(" ---------------------------");
		System.out.printf("| Saldo Anterior: %.2f   |\n" , c.getSaldo());
		c.atualiza(this.selic);
		setSaldoTotal(c.getSaldo());
		System.out.printf("| Saldo Atualizado: %.2f |\n", c.getSaldo());
		System.out.println(" ---------------------------");
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}
