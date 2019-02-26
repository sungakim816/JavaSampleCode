/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int lowEnd, highEnd, sumInRange = 0, sumOutRange = 0, dataPoint = -1;
		System.out.println("In-range Adder");
		System.out.print("Low end of range: ");
		lowEnd = scan.nextInt();
		System.out.print("High end of range: ");
		highEnd = scan.nextInt();
		while (dataPoint != 0) {
			System.out.print("Enter data: ");
			dataPoint = scan.nextInt();
			if (dataPoint > highEnd || dataPoint < lowEnd) {
				sumOutRange += dataPoint;
			} else {
				sumInRange += dataPoint;
			}
		}
		System.out.println("Sum of in range values: " + sumInRange);
		System.out.println("Sum of out of range values: " + sumOutRange);
		scan.close();
	}

}
