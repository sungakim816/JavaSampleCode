/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double d, g = 32.174;
		System.out.print("Enter the number of seconds: ");
		double t = scan.nextDouble();
		d = (1.0 / 2.0) * (g * Math.pow(t, 2));
		System.out.println("Distance: " + d + " feet");
		scan.close();

	}

}
