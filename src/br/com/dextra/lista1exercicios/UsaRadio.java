package br.com.dextra.lista1exercicios;

public class UsaRadio {

	public static void main(String[] args) {
		Radio r1 = new Radio(3);
		Radio r2 = new Radio(10);
		System.out.println(r1.exibeVolume());
		System.out.println(r2.exibeVolume());
	}

}
