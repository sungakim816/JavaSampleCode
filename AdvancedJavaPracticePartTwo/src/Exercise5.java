/**
 * 
 */


/**
 * @author Sunga
 *
 */
public class Exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = { 0, 1, 2, 3 };
		int temp, i = 0, j = val.length - 1;
		System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
		// reverse the order of the numbers in the array
		while (j > i) {
			temp = val[i];
			val[i] = val[j];
			val[j] = temp;
			i++;
			j--;
		}
		System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
	}
}
