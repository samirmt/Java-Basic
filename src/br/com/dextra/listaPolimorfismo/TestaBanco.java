package br.com.dextra.listaPolimorfismo;

public class TestaBanco {

	public static void main(String[] args) {
		AtualizadorDeContas atc = new AtualizadorDeContas(0.01);
		Banco banco = new Banco();
		Conta cc = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		banco.adiciona(cc);
		banco.adiciona(cc2);
		banco.adiciona(cp);
		
		cc.deposita(990);
		cc2.deposita(1000);
		cp.deposita(1000);
		
		for(int i = 0; i < banco.contas.length; i++){
			atc.roda(banco.pegaConta(i));
		}
		
		System.out.printf(" Saldo Total..:R$ %.2f" , banco.pegaTotalDeContas());

	}

}
