/**
 * 
 */


/**
 * @author Sunga
 *
 */
public class ReverserVersion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int size = data.length;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[size - (i + 1)] = data[i];
		}
		for (int j : result) {
			System.out.print(j + " ");
		}
	}

}
