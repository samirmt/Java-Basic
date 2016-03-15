package br.com.dextra.enuns;

public enum Operation {
	SOMA,
	SUBTRAI,
	MULTIPLICA,
	DIVIDI;
	
	
	
	
	
	public double eval(double x, double y) {
		switch(this){
			case SOMA: return (x + y);
			case SUBTRAI: return (x - y);
			case MULTIPLICA: return (x * y);
			case DIVIDI: return (x / y);
		}
		return 0;
	}
	
	
	
	
}
