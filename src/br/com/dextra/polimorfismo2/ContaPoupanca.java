package br.com.dextra.polimorfismo2;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	@Override
	public void atualiza(double taxa) {
		//this.saldo += this.saldo * taxa * 3;
		super.atualiza(taxa * 3);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor + 0.2;
		
	}
/*
	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.numero > o.numero){
			return 1;
		}else
			if(this.numero < o.numero){
				return -1;
		}		
		return 0;
	}
/*
 * 
 * 
 * 	
 */
	/*
	@Override
	public int compareTo(ContaPoupanca o) {
		return this.nomeCliente.compareTo(o.nomeCliente);
	}
	*/
	public int compareTo(ContaPoupanca o) {
		if(this.saldo > o.saldo){
			return 1;
		}else
			if(this.saldo < o.saldo){
				return -1;
		}		
		return 0;
	}
}
