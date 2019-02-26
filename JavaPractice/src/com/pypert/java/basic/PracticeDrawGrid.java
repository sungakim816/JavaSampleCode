package com.pypert.java.basic;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;

public class PracticeDrawGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		System.out.print("Range: ");
		int range = scan.nextInt();
		Random rand = new Random();
		int[] randomNumbers = new int[n - 1];
		for (int i = 0; i < randomNumbers.length; i++) {
			while (true) {
				int tempVal = rand.nextInt(range + 1);
				if (!IntStream.of(randomNumbers).anyMatch(x -> x == tempVal) || tempVal == 0) {
					randomNumbers[i] = tempVal;
					break;
				}
			}
		}
		System.out.print("Random Values: ");
		for (int i : randomNumbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[][] twoDGrid = new int[n][n];
		for (int row = 0; row < twoDGrid.length; row++) {
			for (int rowElement = 0; rowElement < twoDGrid[0].length; rowElement++) {
				if ((row == rowElement && row == twoDGrid.length - 1)) {
					break;
				} else if (rowElement == twoDGrid.length - 1) {
					int tmp = row; // sum for each row elements
					twoDGrid[row][rowElement] = IntStream
							.of(IntStream.range(0, twoDGrid.length - 1).map(i -> twoDGrid[tmp][i]).toArray()).sum();
				} else if (row == twoDGrid.length - 1) {
					int tmp = rowElement;
					twoDGrid[row][rowElement] = IntStream // sum for each column elements
							.of(IntStream.range(0, twoDGrid.length - 1).map(i -> twoDGrid[i][tmp]).toArray()).sum();
				} else {
					twoDGrid[row][rowElement] = randomNumbers[rand.nextInt(n - 1)];
				}
			}
		}
		for (int row = 0; row < twoDGrid.length; row++) {
			for (int rowElement = 0; rowElement < twoDGrid[0].length; rowElement++) {
				if ((row == rowElement && row == twoDGrid.length - 1)) {
					break;
				} else if (twoDGrid[row][rowElement] > 9)
					System.out.print(twoDGrid[row][rowElement] + " ");
				else
					System.out.print(twoDGrid[row][rowElement] + "  ");
			}
			System.out.println();
		}

		scan.close();
	}

}
