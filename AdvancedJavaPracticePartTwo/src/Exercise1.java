/**
 * 
 */


import java.util.stream.IntStream;

/**
 * @author Sunga
 *
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = { 0, 1, 2, 3 };
		int sum = IntStream.of(val).sum();
		System.out.println("Sum of all numbers = " + sum);
	}

}
