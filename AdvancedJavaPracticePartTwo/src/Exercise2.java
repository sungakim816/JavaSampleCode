/**
 * 
 */


import java.util.stream.IntStream;

/**
 * @author Sunga
 *
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	public static int doubleNum(int n) {
		return n * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = { 13, -4, 82, 17 };
		int[] twice;
		System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
		twice = IntStream.of(val).map(j -> j * 2).toArray();
		System.out.println("New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);

	}

}
