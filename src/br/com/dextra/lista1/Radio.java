package br.com.dextra.lista1;

public class Radio {
	int volume;
	
	Radio(int volume){
		this.volume = volume;
	}
	
	String exibeVolume(){
		return "Vol: " + this.volume;
	}
}
