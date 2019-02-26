import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise17 {

	public static int[][] imageSmoother(int[][] image) {
		int[][] smooth = new int[image.length][image[0].length];
		int sum;
		for (int row = 1; row < image.length - 1; row++) {
			sum = 0;
			for (int col = 1; col < image[row].length - 1; col++) {
				sum = (image[row - 1][col - 1] + image[row - 1][col] + image[row - 1][col + 1] + image[row][col - 1]
						+ image[row][col] + image[row][col + 1] + image[row + 1][col - 1] + image[row + 1][col]
						+ image[row + 1][col + 1]);
				smooth[row][col] = sum / 9;
			}
		}
		return smooth;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("RawImage.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String[]> data = new ArrayList<>();
		String st;
		// get the data line by line
		while ((st = reader.readLine()) != null) {
			if (st.length() != 0)
				data.add(st.trim().split(" "));
		}
		// transfer the data to a 2D integer array
		int[][] image = new int[data.size()][];
		for (int row = 0; row < data.size(); row++) {
			image[row] = Arrays.stream(data.get(row)).mapToInt(i -> Integer.parseInt(i.trim())).toArray();
		}
		int[][] smooth = new int[image.length][image[0].length];
		// print raw data
		System.out.println("\nRaw Image: ");
		for (int row = 0; row < image.length; row++) {
			for (int col = 0; col < image[row].length; col++) {
				System.out.print(image[row][col] + " ");
			}
			System.out.println();
		}
		// process
		smooth = imageSmoother(image);
		// print smooth image
		System.out.println("\nSmooth Image");
		for (int row = 0; row < smooth.length; row++) {
			for (int col = 0; col < smooth[row].length; col++) {
				System.out.print(smooth[row][col] + " ");
			}
			System.out.println();
		}
	}

}
