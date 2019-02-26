package com.pypert.java.basic;

import java.util.ArrayList;

public class PrimeNumberChecker {
	public static ArrayList<Integer> storedPrimes = new ArrayList<Integer>();

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (Integer i : storedPrimes) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void getPrimes(int limit) {
		int i = 0;
		while (i <= limit) {
			if (isPrime(i)) {
				storedPrimes.add(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1;
		int sqrtLimit = (int) Math.pow(n, 0.5);
		getPrimes(sqrtLimit);
		if (isPrime(n)) {
			System.out.println(n + " is a Prime Number.");
		} else {
			System.out.println(n + " is not a Prime Number.");
		}
	}

}
