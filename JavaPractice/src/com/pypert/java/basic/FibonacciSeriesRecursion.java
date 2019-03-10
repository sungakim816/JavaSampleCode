/**
 * 
 */
package com.pypert.java.basic;

import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class FibonacciSeriesRecursion {

	/**
	 * @param args
	 */

	public static int fibonacciRecurseSeries(int n, int[] mem) {
		if (n == 0 || n == 1) {
			return n;
		} else if (mem[n] != 0) {
			return mem[n];
		} else {
			mem[n] = fibonacciRecurseSeries(n - 1, mem) + fibonacciRecurseSeries(n - 2, mem);
			return mem[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		int terms = in.nextInt();
		int[] memo = new int[terms];

		for (int i = 0; i < terms; i++) {
			System.out.print(fibonacciRecurseSeries(i, memo) + " ");
		}
		in.close();
	}

}
