/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class OhmsLaw {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("I = V / R");
		System.out.print("Voltage (volts): ");
		int voltage = scan.nextInt();
		System.out.print("Resistance (ohms): ");
		int resistance = scan.nextInt();
		double current = ((voltage + 0.0) / resistance);
		System.out.print("Result (amps): " + current);
		scan.close();
	}

}
