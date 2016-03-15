package br.com.dextra.exerciosiniciais;

public class TestandoAtributos {
	//Atributos numéricos
	private byte idade;
	private short nivel;
	private int resultadoSoma;
	private double resultadoDivisao;
	private long id;
	private float numeroFloat;
	
	//Atributos "Textos"
	private String nome; 
	
	//Método para preenchimento das variáveis
	public void preencheVariaveis(){
		idade = 25;
		nivel = 1000;
		resultadoSoma = resultadoSoma(2, 3);
		resultadoDivisao = resultadoDivisao(10.0, 4.0);
		id = 56546456454L;
		numeroFloat = 1.23f;
		nome = "Tiago";
	}
	
	public int resultadoSoma(int numero1, int numero2){
		int resultado;
		resultado = numero1 + numero2;
		return resultado;
	}
	
	public double resultadoDivisao(double numero1, double numero2){
		double resultado;
		resultado = numero1 / numero2;
		return resultado;
	}
	
	public byte getIdade(){
		return idade;
	}
	
	public short getNivel() {
		return nivel;
	}

	public int getResultadoSoma() {
		return resultadoSoma;
	}

	public double getResultadoDivisao() {
		return resultadoDivisao;
	}

	public long getId() {
		return id;
	}

	public float getNumeroFloat() {
		return numeroFloat;
	}

	public String getNome() {
		return nome;
	}
	
	/*public String retornaInverso(String palavra){
		palavra.
	}*/
	
	public void testeRepete(){
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
	}

	public static void main (String[] args){
		//Criando objeto
		TestandoAtributos objetoTeste = new TestandoAtributos();
		objetoTeste.preencheVariaveis();
		objetoTeste.testeRepete();
		
		long id2 = objetoTeste.getId();
		byte idade2 = objetoTeste.getIdade();
		short nivel2 = objetoTeste.getNivel();
		String nome2 = objetoTeste.getNome();
		float numeroFloat2 = objetoTeste.getNumeroFloat();
		double resultadoDivisao2 = objetoTeste.getResultadoDivisao();
		int resultadoSoma2 = objetoTeste.getResultadoSoma();
		
		System.out.println("ID -> " + id2);
		System.out.println("Idade -> " + idade2);
		System.out.println("Nivel ->" + nivel2);
		System.out.println("Nome ->" + nome2);
		System.out.println("Número Float ->" + numeroFloat2);
		System.out.println("Resultado Divisão ->" + resultadoDivisao2);
		System.out.println("Resultado Soma ->" + resultadoSoma2);
	}
}
