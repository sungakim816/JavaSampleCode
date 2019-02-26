/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n, i;
		System.out.print("Initial Number Of n: ");
		n = scan.nextInt();
		while (n > 0) {
			i = n;
			while (i > 0) {
				System.out.print("*");
				i--;
			}
			System.out.println();
			n--;
		}
		scan.close();
	}

}
