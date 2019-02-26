/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise44 {

	/**
	 * @param args
	 */
	public static double factorialRecursion(double n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorialRecursion(n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double eRaiseToX = 1, result, x;
		int N = 1;
		System.out.print("e raise to x\n\nEnter x: ");
		x = scan.nextDouble();
		while (true) {
			result = (Math.pow(x, N) / factorialRecursion(N));
			eRaiseToX += result;
			System.out.println("n: " + N + " term: " + result + " sum: " + eRaiseToX);
			N++;
			if (result <= 1.0e-12)
				break;
		}
		System.out.println("e^x: " + eRaiseToX);
		System.out.println("Using Math.exp(x): " + Math.exp(2));
		scan.close();

	}

}
