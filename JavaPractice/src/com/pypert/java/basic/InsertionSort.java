package com.pypert.java.basic;

public class InsertionSort {
	public static int[] insertionSort(int[] arr) {
		int i = 1, j = 0, temp = 0;
		while (i < arr.length) {
			j = i - 1;
			while (j > -1 && arr[j + 1] < arr[j]) {
				// swapping
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 2, 1 };
		arr = insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
