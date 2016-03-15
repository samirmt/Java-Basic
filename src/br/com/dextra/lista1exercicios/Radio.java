package br.com.dextra.lista1exercicios;

public class Radio {
	int volume;
	
	Radio(int volume){
		this.volume = volume;
	}
	
	String exibeVolume(){
		return "Vol: " + this.volume;
	}
}
