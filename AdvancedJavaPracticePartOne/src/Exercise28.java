/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int start, end;

		System.out.print("Enter start: ");
		start = scan.nextInt();
		System.out.print("Enter end: ");
		end = scan.nextInt();
		if (start >= end) {
			while (start >= end) {
				System.out.println(start);
				start--;
			}
		} else {
			while (start <= end) {
				System.out.println(start);
				start++;
			}
		}

		scan.close();
	}

}
