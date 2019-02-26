package com.pypert.java.basic;
import java.util.Scanner;

public class FactorialRecursion {

	public static double factorialRecursion(double n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialRecursion(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = userInput.nextInt();
		System.out.println(factorialRecursion(x));
		userInput.close();
	}

}
