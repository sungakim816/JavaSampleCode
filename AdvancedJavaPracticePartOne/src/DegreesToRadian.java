/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class DegreesToRadian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double rad, degrees, sinx, cosx, sum;
		System.out.print("x (degrees): ");
		degrees = scan.nextDouble();
		rad = degrees * (Math.PI / 180);
		sinx = Math.sin(rad);
		cosx = Math.cos(rad);
		sum = Math.pow(sinx, 2) + Math.pow(cosx, 2);
		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
		scan.close();
	}

}
