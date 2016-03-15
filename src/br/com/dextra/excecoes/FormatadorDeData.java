package br.com.dextra.excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorDeData {
	public String formataData(Date d){
		String retorno = "";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			retorno  = sdf.format(d);
		}catch(IllegalArgumentException e){
			retorno = "Formata de Data Inválido: " + e.getMessage();
		}
		return retorno;
	}
	
	
	public static void main(String[] args){
		FormatadorDeData fmt = new FormatadorDeData();
		String dataFormatada = fmt.formataData(new Date());
		
		System.out.println(dataFormatada);
	}
}
