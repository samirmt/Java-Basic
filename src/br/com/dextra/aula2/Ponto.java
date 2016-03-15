package br.com.dextra.aula2;

public class Ponto {
	private double x;
	private double y;
		
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void deslocar(double deltaX, double deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double coordX(){
		return this.x;
	}
	
	public double coordY(){
		return this.y;
	}
	
	public static void main(String[] args){
		Ponto meuPonto1 = new Ponto(2.0, 3.0);
		Ponto meuPonto2 = new Ponto(30, 10);
		
		meuPonto2.x = 25.0;
		meuPonto2.y = 15.0;
		
		System.out.println(meuPonto1.x);
		System.out.println(meuPonto1.y);
		
		System.out.println(meuPonto2.x);
		System.out.println(meuPonto2.y);
	}
}
