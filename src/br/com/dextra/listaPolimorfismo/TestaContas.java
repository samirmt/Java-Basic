package br.com.dextra.listaPolimorfismo;

public class TestaContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc2.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas atc = new AtualizadorDeContas(0.01);
		
		atc.roda(cc);
		atc.roda(cc2);
		atc.roda(cp);
		
		System.out.printf(" Saldo Total..:R$ %.2f" , atc.getSaldoTotal());
	}

}
