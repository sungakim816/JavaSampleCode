/**
 * 
 */


import java.util.Arrays;

/**
 * @author Sunga
 *
 */
public class Exercise7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 1, 5, 7, 4, 12, -3, 8, -2 };
		int size = data.length;
		// declare and initialize variables for the two largest
		// compute the two largest
		Arrays.sort(data);
		// write out the two largest
		System.out.println("Two largest Number of the array: " + data[size - 1] + " " + data[size - 2]);
	}
}
