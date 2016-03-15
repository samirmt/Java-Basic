package br.com.dextra.listaPolimorfismo;

public class Banco {
	public Conta[] contas = new Conta[3];
	
	public void adiciona(Conta c){
		int cont = 0;
		while(this.contas[cont] != null){
			cont ++;
		}
		this.contas[cont] = c;
	}
	
	public Conta pegaConta(int x){
		return this.contas[x];
	}
	
	public double pegaTotalDeContas(){
		double soma = 0.0;
		for(Conta ct: contas){
			soma += ct.getSaldo();
		}
		return soma;
	}


}
