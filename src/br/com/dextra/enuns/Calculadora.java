package br.com.dextra.enuns;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculadora {
		
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat hora = new SimpleDateFormat("hh:mm");
		
		System.out.println("Hoje é " + data.format(new Date()));
		System.out.println("Agora é " + hora.format(new Date()) + "\n");
		
		System.out.println("SOMA: " + calc.execute(3, 3, Operation.SOMA));
		System.out.println("SUBTRAÇÃO: " + calc.execute(3, 3, Operation.SUBTRAI));
		System.out.println("DIVISÃO: " + calc.execute(3, 0, Operation.DIVIDI));
		System.out.println("MULTIPLICAÇÃO: " + calc.execute(3, 3, Operation.MULTIPLICA));
	}

}
