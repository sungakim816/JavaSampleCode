/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class AreaOfACircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int radius;
		double circleArea;
		System.out.print("Input the radius: ");
		radius = scan.nextInt();
		circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("The radius is: " + radius + ". The area is: " + circleArea);
		scan.close();
	}

}
