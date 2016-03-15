package br.com.dextra.exerciciosiniciais;

public class TestandoAtributos {
	//Atributos numericos
	private byte idade;
	private short nivel;
	private int resultadoSoma;
	private double resultadoDivisao;
	private long id;
	
	//Atributos textos
	private String nome;
	
	//metodo para preenchimento das variaveis
	public void preencheVariaveis(){
		idade = 33;
		nivel = 5500;
		resultadoSoma = resultadoSoma(5, 10);
		resultadoDivisao = resultadoDivisao(3.0, 10.0);
		id = 113215464654L;
		nome = "Samir M Teixeira";
	}
	
	public int resultadoSoma(int n1, int n2){
		return n1 + n2;
	}
	
	public double resultadoDivisao(double n1, double n2){
		return n1/n2;
	}
	
	//Metodos Get's
	public byte getIdade(){
		return this.idade;
	}
	
	public short getNivel(){
		return nivel; 
	}
	
	public int getResultadoSoma(){
		return resultadoSoma;
	}
	
	public double getResultadoDivisao(){
		return this.resultadoDivisao; 
	}
	
	public long getId(){
		return this.id; 
	}
	
	public String getNome(){
		return nome; 
	}
	
	
	//Metodos Set's
	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public void setNivel(short nivel) {
		this.nivel = nivel;
	}

	public void setResultadoSoma(int resultadoSoma) {
		this.resultadoSoma = resultadoSoma;
	}

	public void setResultadoDivisao(double resultadoDivisao) {
		this.resultadoDivisao = resultadoDivisao;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "TestandoAtributos [idade=" + getIdade() + ", nivel=" + getNivel()
				+ ", resultadoSoma=" + getResultadoSoma() + ", resultadoDivisao="
				+ getResultadoDivisao() + ", id=" + getId() + ", nome=" + getNome() + "]";
	}

	public static void main(String[] args) {
				
		//criando objeto
		TestandoAtributos objetoTeste = new TestandoAtributos();
		objetoTeste.preencheVariaveis();
		long id2 = objetoTeste.getId();
		byte idade2 = objetoTeste.getIdade();
		short nivel2 = objetoTeste.getNivel();
		String nome2 = objetoTeste.getNome();
		double resultadoDivisao2 = objetoTeste.getResultadoDivisao();
		int resultadoSoma2 = objetoTeste.getResultadoSoma();
		
		System.out.println("ID-> " + id2);
		System.out.println("IDADE-> " + idade2);
		System.out.println("NIVEL-> " + nivel2);
		System.out.println("NOME-> " + nome2);
		System.out.println("RESULTADO DA DIVISÃO-> " + resultadoDivisao2);
		System.out.println("RESULTADO DA SOMA-> " + resultadoSoma2);
		System.out.println("\n");
		System.out.println(objetoTeste);

	}

}
