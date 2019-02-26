/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class GcfRecursion {

	/**
	 * @param args
	 */
	public static int gcfRecursion(int lower, int higher) {
		if (lower == 1) {
			return 1;
		}

		int remainder = higher % lower;

		if (remainder == 0) {
			return lower;
		} else {
			return gcfRecursion(remainder, lower);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1800, num2 = 80;
		System.out.printf("GCF of %d and %d is %d", num1, num2, gcfRecursion(num1, num2));
	}

}
