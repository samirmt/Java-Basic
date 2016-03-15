package br.com.dextra.manipulacaoArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o nome do Arquivo Texto: ");
		String nome = ler.nextLine();
		System.out.printf("\nConteudo do Arquivo Texto: \n");
		
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while(linha != null){
				System.out.printf("%s\n", linha);
				linha = lerArq.readLine();
			}
			
			System.out.println("\nArquivo lido com sucesso!");
			arq.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.printf("Arquivo não encontrado: " + nome);
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo %s " + e.getMessage());
		}
		
		
	}
}
