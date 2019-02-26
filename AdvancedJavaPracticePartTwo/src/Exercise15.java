

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int max = 0;
		for (int row = 0; row < data.length; row++) {
			max = data[row][0];
			for (int col = 1; col < data[row].length; col++) {
				if (data[row][col] > max)
					max = data[row][col];
			}
			System.out.println("Largest Number in row " + (row + 1) + ": " + max);
		}
	}

}
