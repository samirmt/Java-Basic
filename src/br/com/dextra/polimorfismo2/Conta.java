package br.com.dextra.polimorfismo2;

public abstract class Conta {
	protected double saldo;
	protected long numero;
	protected String nomeCliente;
	
	public double getSaldo() {
		return saldo;
	}
	
	public long getNumero(){
		return this.numero;
	}
	
	public void setNumero(long numero){
		this.numero = numero;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public abstract void deposita(double valor);
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
	
	
}
