/**
 * 
 */
package com.pypert.java.basic;

import java.util.Arrays;

/**
 * @author Sunga
 *
 */
public class RemoveDuplicateElement {

	/**
	 * @param args
	 */

	public static int[] removeDuplicateElement(int[] arr) {
		int j = 0;
		int[] arr1 = new int[arr.length];
		arr1[j] = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr1[j] != arr[i]) {
				arr1[++j] = arr[i];// increment the index by 1;

			} else {
				continue;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 60, 90, 50, 60, 70, 90, 1, 10, 50, 10, 2, 3, 4 };
		Arrays.sort(arr); // sort the array first
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr1 = removeDuplicateElement(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
