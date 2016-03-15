package br.com.dextra.formatadores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Datas {

	public void dataLocaleDefault(Date data){
		String dataFormatada = DateFormat.getDateInstance().format(data);
		System.out.println("Default Locale ->" + Locale.getDefault());
		System.out.println("\nData Default Formatada -> " + dataFormatada + "\n");
	}
	
	public void dataLocaleParametrizado(Date data, Locale locale){
		String dataFormatada = DateFormat.getDateInstance(
				DateFormat.LONG,
				locale).format(data);
		System.out.println("Data Parametrizada Formatada -> " + dataFormatada);
	}
	
	public void dataComPatternDiferenciada(Date data){
		SimpleDateFormat sdf = new SimpleDateFormat("EE, dd/MMM/yyy");
		System.out.println("Data Pattern Formatada -> " + sdf.format(data));
	}
	
	public static void main(String[] args) {
		Datas data = new Datas();
		Date hoje = new Date();
		
		data.dataLocaleParametrizado(hoje, Locale.CANADA_FRENCH);
	}

}
