

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int temp = 0;
		System.out.println("Original 2D array: ");
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
		}
		for (int row = 0; row < data.length; row++) {
			int i = 0, j = (data[row].length - 1);
			while (j > i) {
				// perform the operation here
				temp = data[row][i];
				data[row][i] = data[row][j];
				data[row][j] = temp;
				i++;
				j--;
			}
		}
		System.out.println("\nReversed order for each row: ");
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
		}
	}
}
