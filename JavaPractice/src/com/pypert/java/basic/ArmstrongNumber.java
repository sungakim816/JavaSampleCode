package com.pypert.java.basic;

import java.util.ArrayList;

public class ArmstrongNumber {

	public static boolean isArmstrong(int n) {
		int m, k = 0;
		m = n;
		while (m > 0) {
			k += Math.pow((double) (m % 10), 3.0);
			m = m / 10;
		}

		if (k == n) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			if (isArmstrong(i)) {
				arr.add(i);
			}
		}

		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}
}
