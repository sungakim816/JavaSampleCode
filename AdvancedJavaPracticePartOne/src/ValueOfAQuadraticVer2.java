/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class ValueOfAQuadraticVer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double value = 0.0;
		System.out.println("Enter three numbers seperated by spaces: ");
		String[] x = scan.nextLine().split(" ");
		scan.close();

		for (String val : x) {
			value = 3 * Math.pow(Double.parseDouble(val), 2) + (-8 * Double.parseDouble(val)) + 4;
			System.out.println("3x^2 -8x + 4 = " + value + " if x = " + val);
		}
	}

}
