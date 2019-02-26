/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int sumofSquares, sumofCubes, n;
		System.out.println("Sum of Squares and Cubes");
		System.out.print("Enter n: ");
		n = scan.nextInt();

		sumofSquares = n * (n + 1) * (2 * n + 1) / 6;
		sumofCubes = (int) (Math.pow(n, 2) * Math.pow((n + 1), 2) / 4);
		System.out.println("The sum of squares is " + sumofSquares);
		System.out.println("The sum of cubes is " + sumofCubes);
		scan.close();
	}

}
