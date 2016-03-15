package br.com.dextra.enuns;

public class Calculator {
	
	public double execute(double x, double y, Operation op){
		if(op == Operation.DIVIDI && y == 0){
			return Double.NaN;
		}else{
			return op.eval(x, y);
		}
	}
	
	
}
