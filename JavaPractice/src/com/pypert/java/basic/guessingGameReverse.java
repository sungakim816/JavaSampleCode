/**
 * 
 */
package com.pypert.java.basic;

import java.util.Random;
import java.util.ArrayList;

/**
 * @author Sunga
 *
 */
public class guessingGameReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		ArrayList<Integer> guesses = new ArrayList<Integer>();
		int lower_limit = 0, higher_limit = 10001, counter = 0, guess = 0;
		int mystery_number = rand.nextInt(higher_limit);
		while (lower_limit <= higher_limit) {
			guess = lower_limit + (higher_limit - lower_limit) / 2;
			guesses.add(guess);
			counter++;
			if (guess == mystery_number) {
				break;
			} else if (guess > mystery_number) {
					higher_limit = guess - 1;
			} else {
				lower_limit = guess + 1;
			}
		}
		
		if (guess == mystery_number) {
			System.out.println("I Got It Right.");
			System.out.println("Mystery Number is " + mystery_number);
			System.out.print("Guesses: ");
			for (int i: guesses) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("Try/tries: " + counter);
		} else {
			System.out.println("Sorry I Messed Up.");
		}

	}

}
