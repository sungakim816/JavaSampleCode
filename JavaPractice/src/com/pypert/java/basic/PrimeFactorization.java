/**
 * 
 */
package com.pypert.java.basic;

import java.util.ArrayList;

/**
 * @author Sunga
 *
 */
public class PrimeFactorization {

	/**
	 * @param args
	 */

	public static ArrayList<Integer> storedPrimes = new ArrayList<Integer>();

	public static void getPrimes(int limit) {
		int i = 0;
		while (i <= limit) {
			if (isPrime(i)) {
				storedPrimes.add(i);
			}
			i++;
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2) { // any number less than 2 will not be considered as prime
			return false;
		} else if (n == 2) { // '2' is the smallest prime numbers
			return true;
		} else {
			for (int i : storedPrimes) { // only prime numbers will be used to check if other numbers are also prime
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static ArrayList<Integer> getPrimeFactors(double n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int possibleFactor = 2;
		while (n > 1) { // if n == 1, the loop must be stop
			if (isPrime(possibleFactor)) {// only prime numbers will be considered
				storedPrimes.add(possibleFactor);
				while (n % possibleFactor == 0) { // divide until possibleFactor is not a factor of 'n'
					factors.add(possibleFactor); // add to factors
					n = n / possibleFactor; // reduce n
				}
			}
			possibleFactor++; // increment possible factor
		}
		return factors;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 1999993;
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		primeFactors = getPrimeFactors(n);
		System.out.println();
		if (primeFactors.size() == 1) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println("The Prime Factors of " + n + " are the following: ");
			for (int i : primeFactors) {
				System.out.print(i + " ");
			}
		}
	}
}
