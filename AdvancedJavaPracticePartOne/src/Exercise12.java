/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a double: ");
		double x = scan.nextDouble();
		System.out.println("Base 2 Log of " + x + " is " + Math.log(x) / Math.log(2));
		scan.close();
	}

}
