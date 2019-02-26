/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise43 {

	/**
	 * @param args
	 */
	public static double[] computeDrugPotency(double effectivenessLoss) {
		effectivenessLoss = effectivenessLoss / 100;
		int month = (int) (Math.log(50.0 / 100.0) / Math.log(1 - effectivenessLoss));
		double lastEffectiveness = 100 * Math.pow((1 - effectivenessLoss), month);
		return new double[] { month, lastEffectiveness };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double lostInEffectiveness;
		double[] result;
		System.out.print("Rate of loss interms of  effectiveness every month (in percentage): ");
		lostInEffectiveness = scan.nextDouble();
		result = computeDrugPotency(lostInEffectiveness);
		System.out.println(
				"The Drug can last up to " + result[0] + " months with an effectiveness of " + result[1] + "%");
		scan.close();
	}

}
