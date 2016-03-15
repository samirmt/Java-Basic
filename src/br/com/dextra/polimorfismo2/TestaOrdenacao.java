package br.com.dextra.polimorfismo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {

	public void imprimeNumeroContas(List<ContaPoupanca> conta){
		for(ContaPoupanca cp : conta){
			System.out.println("Saldo da Conta :-> " + cp.getSaldo());
		}
	}
	
	public static void main(String[] args) {
		TestaOrdenacao obj = new TestaOrdenacao();
		List<ContaPoupanca> contasPoupanca = new ArrayList<>();
		LinkedList<ContaPoupanca> contasP = new LinkedList<ContaPoupanca>();
		Random r = new Random();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		
		cp2.setNomeCliente("Samir");
		cp3.setNomeCliente("Andre");
		cp4.setNomeCliente("Fernando");
		cp2.saldo = 5.0 + (double)(1000 * r.nextDouble());
		cp3.saldo = 5.0 + (double)(1000 * r.nextDouble());
		cp4.saldo = 5.0 + (double)(1000 * r.nextDouble());
		
		contasP.add(cp2);
		contasP.add(cp3);
		contasP.add(cp4);
		
		
		
		/*
		for(int i = 10016; i >= 10000; i--){
			ContaPoupanca cp = new ContaPoupanca();
			cp.setNumero(new Long(i));
			contasPoupanca.add(cp);
		}
		
		for(int i = 10016; i >= 10000; i--){
			ContaPoupanca cp = new ContaPoupanca();
			cp.setNumero(new Long(i));
			contasP.add(cp);
		}
		*/
		
		//Ordena
		//Collections.sort(contasPoupanca);
		Collections.sort(contasP);
		//Embaralha
		//Collections.shuffle(contasP);
		//Inverte
		//Collections.reverse(contasP);
		
		//imprimi
		//obj.imprimeNumeroContas(contasPoupanca);
		obj.imprimeNumeroContas(contasP);
	}

}
