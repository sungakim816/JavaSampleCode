/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class PalindromeIntegerOnly {

	/**
	 * @param args
	 */

	public static boolean isPalindrome(int n) {
		int m = n, k = 0;
		while (m > 0) {
			k = k * 10 + m % 10;
			m = m / 10;
		}
		if (k == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (isPalindrome(10001)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not Palindrome.");
		}
	}

}
