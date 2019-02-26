/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static int[] bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isSwapped = false;// checks if the list is already sorted.
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 5, 1, 4, 2, 8 };
		arr = bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
