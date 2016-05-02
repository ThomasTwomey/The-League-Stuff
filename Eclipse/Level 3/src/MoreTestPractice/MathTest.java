package MoreTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		assertEquals(Math.sin(6050505), parseTrigFunction("sin(6050505)"), 0);
		assertEquals(Math.cos(45), parseTrigFunction("cos(45)"), 0);
		assertEquals(Math.tan(123123), parseTrigFunction("tan(123123)"), 0);
	}

	public double parseTrigFunction(String s) {
		String numString = "";
		String substring = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				substring = s.substring(i + 1);
			}
		}
		for (int i = 0; i < substring.length() - 1; i++) {
			numString += substring.charAt(i);
		}
		double returnNum = 0;
		double calcNum = Double.parseDouble(numString);
		if (s.contains("sin"))
			returnNum = Math.sin(calcNum);
		else if (s.contains("cos"))
			returnNum = Math.cos(calcNum);
		else if (s.contains("tan")) {
			returnNum = Math.tan(calcNum);
		}
		return returnNum;
	}

}
