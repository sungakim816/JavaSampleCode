/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class MicrowaveOven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String message = "";
		double heatingTimeMinutes, heatingTimeSeconds, totalTimeSeconds;
		int numItems = 0;
		System.out.print("Number of Items: ");
		numItems = scan.nextInt();
		System.out.println("Single-item heating time");
		System.out.print("Minutes: ");
		heatingTimeMinutes = scan.nextDouble();
		System.out.print("Seconds: ");
		heatingTimeSeconds = scan.nextDouble();

		totalTimeSeconds = heatingTimeMinutes * 60 + heatingTimeSeconds;
		if (numItems == 1) {
			message = "Total Heating Time:\n" + heatingTimeMinutes + " min and " + heatingTimeSeconds + " sec";
		} else if (numItems == 2) {
			totalTimeSeconds += totalTimeSeconds * 0.5;
			message = "Total Heating Time:\n" + Math.round(totalTimeSeconds / 60) + " min and "
					+ (int) totalTimeSeconds % 60 + " sec";
		} else if (numItems == 3) {
			totalTimeSeconds += totalTimeSeconds;
			message = "Total Heating Time:\n" + Math.round(totalTimeSeconds / 60) + " min and "
					+ (int) totalTimeSeconds % 60 + " sec";
		} else if (numItems > 3) {
			message = "Heating More Than 3 items is invalid.";
		}
		System.out.println(message);
		scan.close();
	}

}
