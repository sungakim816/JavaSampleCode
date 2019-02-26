

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int sum = 0;
		// declare the sum
		// compute the sum
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				sum += data[row][col];
			}
		}
		// write out the sum
		System.out.println("Sum: " + sum);
	}

}
