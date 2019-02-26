

import java.util.stream.IntStream;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		int colSum;
		int[] colsNum = IntStream.range(0, data.length).map(i -> data[i].length).sorted().toArray();

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("");
		for (int col = 0; col < colsNum[colsNum.length - 1]; col++) {
			colSum = 0;
			for (int row = 0; row < data.length; row++) {
				try {
					colSum += data[row][col];
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
			System.out.println("Col " + (col + 1) + " sum: " + colSum);
		}
	}

}
