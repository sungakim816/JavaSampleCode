package com.pypert.java.basic;

public class CoinChangeCombination {

	public static int compute_combination_count(int[] coins, int n) {
		int[] combinations = new int[n + 1];
		combinations[0] = 1;
		for (int coin : coins) {
			for (int amount = 1; amount < combinations.length; amount++) {
				if (amount >= coin) {
					combinations[amount] += combinations[amount-coin];
				}
			}
		}
		return combinations[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin_values = { 1, 2, 3 };
		int n = 4;
		int combination_count = compute_combination_count(coin_values, n);
		System.out.print("Total possible coin change combination: " + combination_count);

	}

}
