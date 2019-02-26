/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */

	public static int[] selectionSort(int[] arr) {
		int smallest, idx, temp;
		for (int i = 0; i < arr.length; i++) {
			smallest = arr[i];
			idx = i;
			for (int j = i; j < arr.length; j++) {
				if (smallest > arr[j]) { // first, find the smallest element of the unsorted sub-array;
					smallest = arr[j];
					idx = j;
				}
			}
			if (smallest != arr[i]) {
				temp = arr[i];// store the value;
				arr[i] = arr[idx]; // swap the value;
				arr[idx] = temp; // swap the value;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 64, 25, 12, 22, 11, -90 };
		arr = selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
