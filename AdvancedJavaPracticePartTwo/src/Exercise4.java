/**
 * 
 */


import java.util.stream.IntStream;

/**
 * @author Sunga
 *
 */
public class Exercise4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valA = { 13, -22, 82, 17 };
		int[] valB = { 0, 0, 0, 0 };
		// Put values into valB so that the sum of the values
		// in corresponding slots of valA and valB is 25.
		valB = IntStream.of(valA).map(i -> 25 - i).toArray();
		
		System.out.println("valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);
		System.out.println("valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
		System.out.println("sum: " + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " " + (valA[2] + valB[2]) + " "
				+ (valA[3] + valB[3]));
	}
}
