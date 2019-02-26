

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int min = 0, max = 0;
		// declare the sum
		// compute the sum
		min = data[0][0];
		max = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < min)
					min = data[row][col];
				if (data[row][col] > max)
					max = data[row][col];
			}
		}
		// write out the sum
		System.out.println("Smallest Number: " + min + " Largest Number: " + max);
	}

}
