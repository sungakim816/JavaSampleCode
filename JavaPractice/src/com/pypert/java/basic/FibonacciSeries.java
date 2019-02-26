package com.pypert.java.basic;

import java.math.BigInteger;

/**
 * @author Sunga
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger currentX = new BigInteger("0"), previousX, futureX = new BigInteger("1");
		int idx = 0;
		while (currentX.toString().length() < 1000) {
			idx++;
			previousX = currentX;
			currentX = futureX;
			futureX = futureX.add(previousX);
		}
		System.out.println("Fibonacci Number with atleast 1000 digits: " + currentX);
		System.out.println("Number of Digits: " + currentX.toString().length());
		System.out.println("Index/Position: " + idx);
	}
}
