/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x1, y1, x2, y2, width, height;
		while (true) {
			System.out.print("First corner X coordinate: ");
			x1 = scan.nextInt();
			System.out.print("First corner Y coordinate: ");
			y1 = scan.nextInt();
			System.out.print("Second corner X coordinate: ");
			x2 = scan.nextInt();
			System.out.print("Second corner Y coordinate: ");
			y2 = scan.nextInt();
			width = Math.abs(x1 - x2);
			height = Math.abs(y1 - y2);
			if (width <= 0 || height <= 0 || x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
				break;
			} else {
				System.out.println("Width: " + width + " Height: " + height + " Area: " + (width * height));
			}
		}
		System.out.println("Invalid. Bye.");
		scan.close();
	}

}
