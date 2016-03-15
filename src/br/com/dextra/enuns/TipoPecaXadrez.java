package br.com.dextra.enuns;
/**
 * 
 * @author SamirMT
 *
 */
public enum TipoPecaXadrez {
	PEAO(1, "Peão"), 
	TORRE(2, "Torre"), 
	CAVALO(3, "Cavalo"),
	BISPO(4, "Bispo"),
	DAMA(5, "Dama"),
	REI(6, "Rei");
	
	private int peso;
	private String nome;
	
	
	
	public int getPeso() {
		return peso;
	}

	public String getNome() {
		return nome;
	}

	
	 TipoPecaXadrez(int peso, String nome) {
		this.peso = peso;
		this.nome = nome;
	}
	
	public static TipoPecaXadrez returnPeso(int peso){
		for(TipoPecaXadrez tipo : values()){
			if(tipo.peso == peso){
				return tipo;
			}
		}
		return null;
	}
	
}
