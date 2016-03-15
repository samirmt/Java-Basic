package br.com.dextra.strings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ManipuladordeStrings {
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Robot robot = null;
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("A");
		stringBuffer.append("E");
		stringBuffer.append("I");
		stringBuffer.append("O");
		stringBuffer.append("U");
		System.out.println(stringBuffer.toString());
		stringBuffer.reverse();
		System.out.println(stringBuffer.toString());
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.mouseMove(50, 150);
		robot.mousePress(InputEvent.BUTTON1_MASK);
	}

}
