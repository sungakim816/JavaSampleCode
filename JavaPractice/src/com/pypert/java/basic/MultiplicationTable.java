package com.pypert.java.basic;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (i * j < 10)
					System.out.print(i * j + "  ");
				else
					System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
