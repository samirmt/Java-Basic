package br.com.dextra.manipulacaoArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Tabuada obj = new Tabuada();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe qual tabuada a ser gerada: ");
		int tab = teclado.nextInt();
		obj.geraArquivoTxt2(tab);
		teclado.close();
				
	}
	
	private void geraTabuada(int i){
		StringBuffer t =  new StringBuffer();
		t.append("**** Tabuada do " + i + " *****\n");
		int r;
		
		for(int x = 1; x < 11; x ++){
			r = x * i;
			t.append("\n");
			t.append("\t" + i +  " x " +  x + " = " + r);
		}
		this.geraArquivoTxt(t.toString());

	}
	
	private void geraArquivoTxt(String file){
		final String path = "txt/tabuada.txt";
		try{
			FileWriter arq = new FileWriter(path);
			PrintWriter gravaArq = new PrintWriter(arq);
			gravaArq.print(file);
			arq.close();
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
		System.out.println("Arquivo Gravado com Sucesso! -> " + path);
	}
	
	private void geraArquivoTxt2(int n){
		final String path = "txt/tabuada.txt";
		
		try {
			FileWriter arq = new FileWriter(path);
			PrintWriter gravaArq = new PrintWriter(arq);
			
			for(int i = 1; i < 11; i++){
				gravaArq.printf("| %2d x %2d = %2d |\n", n, i, i*n);
			}
			gravaArq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Arquivo Gravado com Sucesso! -> " + path);
	}

}
