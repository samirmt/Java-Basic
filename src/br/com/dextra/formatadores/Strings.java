package br.com.dextra.formatadores;

import java.text.MessageFormat;
import java.util.Date;

public class Strings {

	public static void main(String[] args) {
		String pattern = "Às {2, time, short}" + 
				" em {2,date,long}" + 
				" foram realizados {1, number, integer}" + 
				" vestibulares no {0}";
		
		Object[] parametros = {
			"Brasil",
			new Integer(34),
			new Date()
			
		};
		
		MessageFormat msgF = new MessageFormat(pattern);
		String format = msgF.format(parametros);
		System.out.println("String Formatada -> " + format );

	}

}
