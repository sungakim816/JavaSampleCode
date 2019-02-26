/**
 * 
 */


/**
 * @author Sunga
 *
 */
public class ReverserVersion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int temp, i = 0, j = data.length - 1;
		// reverse the data
		// write out the new data
		while (j > i) {
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		for (int k : data) {
			System.out.print(k + " ");
		}
	}
}
