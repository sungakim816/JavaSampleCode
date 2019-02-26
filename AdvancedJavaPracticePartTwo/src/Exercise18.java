import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise18 {

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
		String result = "";
		File file = new File("RawImage2.txt");
		PrintWriter output = new PrintWriter(file);
		for (int chr = 0; chr < 64; chr += 8) {
			for (int row = 0; row < 8; row++) {
				for (int col = 0; col < 64; col++) {
					result += (" " + String.valueOf(chr));
				}
				result += "\n";
			}
		}
		output.println(result);
		output.close();
		// retrieve data from the text file
		ArrayList<String[]> data = new ArrayList<>();
		System.setIn(new FileInputStream("RawImage2.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String st;
		// transfer to a 2D ArrayList ("data")
		while ((st = reader.readLine()) != null) {
			if (st.length() != 0)
				data.add(st.trim().split(" "));
		}

		// create a 2D integer array
		int[][] image = new int[data.size()][];
		// convert and transfer data from "data" to "image" array
		for (int row = 0; row < data.size(); row++) {
			image[row] = Arrays.stream(data.get(row)).mapToInt(i -> Integer.parseInt(i.trim())).toArray();
		}
		// smooth the image
		int[][] smooth = imageSmoother(image);
		// smoothed image
		System.out.println("Smoothened Image: ");
		for (int row = 0; row < smooth.length; row++) {
			for (int col = 0; col < smooth[row].length; col++) {
				System.out.print(smooth[row][col] + " ");
			}
			System.out.println();
		}
	}
}
