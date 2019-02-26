/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class FibonacciSeriesRecursion {

	/**
	 * @param args
	 */

	public static int fibonacciRecurseSeries(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacciRecurseSeries(n - 1) + fibonacciRecurseSeries(n - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciRecurseSeries(i) + " ");
		}
	}

}
