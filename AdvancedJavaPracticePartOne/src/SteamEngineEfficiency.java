/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class SteamEngineEfficiency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double efficiency, tempAir, tempSteam;
		System.out.print("Temperature of Air (Kelvin): ");
		tempAir = scan.nextDouble();
		System.out.print("Temperature of Steam (Kelvin): ");
		tempSteam = scan.nextDouble();
		if (tempSteam < 373) {
			efficiency = 0;
		} else {
			efficiency = 1 - tempAir / tempSteam;
		}
		System.out.printf("Steam Engine Efficiency: %.4f%%", efficiency*100);
		scan.close();
	}

}
