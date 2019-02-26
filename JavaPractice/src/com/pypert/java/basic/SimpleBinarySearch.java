package com.pypert.java.basic;

import java.util.Arrays;

public class SimpleBinarySearch {

	public static int binarySearchRecursive(int[] arr, int x, int leftIndex, int rightIndex) {
		if (leftIndex > rightIndex) {
			return -1;
		}
		int midPoint = leftIndex + ((rightIndex - leftIndex) / 2);
		if (arr[midPoint] == x) {
			return midPoint;
		} else if (x < arr[midPoint]) {
			return binarySearchRecursive(arr, x, leftIndex, midPoint - 1);
		} else {
			return binarySearchRecursive(arr, x, midPoint + 1, rightIndex);
		}
	}

	public static int binarySearchInterative(int[] arr, int x) {
		int leftIndex = 0, rightIndex = arr.length;
		while (leftIndex <= rightIndex) {
			int midPoint = leftIndex + ((rightIndex - leftIndex) / 2);
			if (arr[midPoint] == x) {
				return midPoint;
			} else if (x < arr[midPoint]) {
				rightIndex = midPoint - 1;
			} else {
				leftIndex = midPoint + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 5, 10 }; // IMPORTANT!: array must be sorted
		Arrays.sort(arr);
		int x = 5;
		int index = binarySearchRecursive(arr, x, 0, arr.length);
		if (index != -1) {
			System.out.println("Recursive Binary Search:");
			System.out.println(x + " is on the given array on index " + index);
			System.out.println("Iterative Binary Search:");
			System.out.println(x + " is on the given array on index " + binarySearchInterative(arr, x));
		} else {
			System.out.println(x + " is not on the given array.");
		}

	}

}
