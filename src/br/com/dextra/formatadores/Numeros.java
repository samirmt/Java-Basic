package br.com.dextra.formatadores;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Numeros {

	public void formataNumeroLocaleDefault(double numeros){
		String numeroFormatado = NumberFormat.getNumberInstance().format(numeros);
		System.out.println("Numero Formatado -> " + numeroFormatado);
	}
	
	public void formataNumeroLocaleParametrizado(double numeros, Locale locale){
		String numeroFormatado = NumberFormat.getNumberInstance(locale).format(numeros);
		System.out.println("Numero Formatado Parametrizado -> " + numeroFormatado);
	}
	
	public void formataNumeroFormataPattern(double numeros, String pattern){
		DecimalFormat f = new DecimalFormat(pattern);
		String numeroFormatado = f.format(numeros);
		System.out.println("Numero Pattern Formatado -> " + numeroFormatado);
	}
	
	public static void main(String[] args) {
		Numeros num = new Numeros();
		num.formataNumeroFormataPattern(123.456, "###,###.00");
	}

}
