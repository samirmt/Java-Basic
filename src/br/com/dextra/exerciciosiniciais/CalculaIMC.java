package br.com.dextra.exerciciosiniciais;

import java.util.Scanner;

public class CalculaIMC {
	
	
	private static Scanner teclado;

	public void calculaIMC(float alt, float peso){
		double imc = peso / (alt*alt);
		retornaResultado(imc, peso);
	}
	
	public void retornaResultado(double imc, float peso){
		if(imc < 17){
			System.out.println("Peso: " + peso + " -> Muito abaixo do peso" + "\nIMC: " + imc);
		}else if (imc > 17 && imc < 18.49){
			System.out.println("Peso: " + peso + " -> Abaixo do peso" + "\nIMC: " + imc);
		}else if(imc > 18.5 && imc < 24.99){
			System.out.println("Peso:" + peso + " -> Peso normal" + "\nIMC: " + imc);
		}else if(imc > 25 && imc < 29.99){
			System.out.println("Peso: " + peso + " -> Acima do peso");
		}else if(imc > 30 && imc < 34.99){
			System.out.println("Peso:" + peso + " -> Obesidade grau I\nVocê ta precisando da umas corridinhas hein!!!");
		}else if (imc > 35 && imc < 39.99){
			System.out.println("Peso:" + peso + " -> Obesidade grau II(severa)\nPrecisa para com a Coca-Cola hein!!!");
		}else if (imc > 40){
			System.out.println("Peso:" + peso + " -> Obesidade grau III(morbida)\nPrecisa parar com o Chops e a Cerveja hein!!!");
		}
	}
	
	public static void main(String[] args) {
		CalculaIMC imc = new CalculaIMC();
		teclado = new Scanner(System.in);
		float peso;
		float altura;
		
		System.out.println("Digite seu Peso:");
		peso = teclado.nextFloat();
		System.out.println("Digite sua altura:");
		altura = teclado.nextFloat();
		imc.calculaIMC(altura, peso);
		
	}

}
