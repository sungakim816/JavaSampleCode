
public class Exerciser12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int rowSum;
		// declare the sum
		// compute the sums for each row
		for (int row = 0; row < data.length; row++) {
			// initialize the sum
			// compute the sum for this row
			rowSum = 0;
			for (int col = 0; col < data[row].length; col++) {
				rowSum += data[row][col];
			}
			// write the sum for this row
			System.out.println("Row " + (row + 1) + " sum: " + rowSum);
		}
	}

}
