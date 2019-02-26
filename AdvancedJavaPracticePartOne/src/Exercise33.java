/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		double sd, sum = 0, element, sumSquare = 0;
		System.out.print("Standard Deviation\n\nHow many data point: ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			element = scan.nextDouble();
			sum += element;
			sumSquare += Math.pow(element, 2);
		}
		sd = Math.sqrt((sumSquare / n) - Math.pow((sum / n), 2));
		System.out.println("Result: " + sd);
		scan.close();
	}
}
