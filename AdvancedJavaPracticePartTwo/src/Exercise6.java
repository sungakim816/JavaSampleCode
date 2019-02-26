/**
 * 
 */


import java.util.stream.IntStream;

/**
 * @author Sunga
 *
 */
public class Exercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
		// declare and initialize three sums
		int sumOfElements = 0, sumOfEven = 0, sumOfOdd = 0;
		sumOfElements = IntStream.of(data).sum();
		sumOfEven = IntStream.of(IntStream.of(data).filter(i -> i % 2 == 0).toArray()).sum();
		sumOfOdd = IntStream.of(IntStream.of(data).filter(i -> i % 2 == 1).toArray()).sum();
		System.out.println("sum of elements: " + sumOfElements);
		System.out.println("sum of even elemetns: " + sumOfEven);
		System.out.println("sum of odd elemetns: " + sumOfOdd);
	}

}
