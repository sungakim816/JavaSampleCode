/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */

public class MatrixMultiplication {

	public static double[][] matrixMultiplication(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < c.length; i++) { // for matrix a
			for (int j = 0; j < c[0].length; j++) { // for matrix b
				for (int k = 0; k < c.length; k++) { // for individual elements
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] A = new double[][] { { 6, 3, 1 }, { 2, 5, 1 }, { 9, 9, 6 } };
		double[][] B = new double[][] { { 7, 4 }, { 6, 7 }, { 5, 0, } };
		if (A[0].length == B.length) {
			double[][] C = matrixMultiplication(A, B);
			for (int i = 0; i < C.length; i++) { // rows
				for (int j = 0; j < C[0].length; j++) { // columns
					System.out.print("  " + C[i][j] + "  ");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"Invalid, the number of rows for matrix a must be equal to the number of columns in matrix b.");
		}
	}
}
