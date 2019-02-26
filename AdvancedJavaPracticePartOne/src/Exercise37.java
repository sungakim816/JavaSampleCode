/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise37 {

	/**
	 * @param args
	 */

	public static void drawTree(int maxLeaves) {
		int numofChar = 1;
		for (int i = maxLeaves / 2; i > -1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < (i + numofChar); j++) {
				System.out.print("*");
			}
			System.out.println();
			numofChar += 2;
		}
	}

	public static void drawTrunk(int pos, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < pos - 1; j++) {
				System.out.print(" ");
			}
			for (int j = pos; j < pos + 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int treeHeight, nthOddNumber, trunkHeight;
		System.out.print("Height of the tree: ");
		treeHeight = scan.nextInt();
		System.out.print("Height of the trunk: ");
		trunkHeight = scan.nextInt();
		nthOddNumber = 2 * treeHeight - 1;
		drawTree(nthOddNumber);
		drawTrunk(nthOddNumber / 2, trunkHeight);

		scan.close();
	}

}
