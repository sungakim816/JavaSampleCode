/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Trigonometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x, sinx, cosx, sum;
		System.out.print("x (radians): ");
		x = scan.nextDouble();
		sinx = Math.sin(x);
		cosx = Math.cos(x);
		sum = Math.pow(sinx, 2) + Math.pow(cosx, 2);

		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
		scan.close();
	}

}
