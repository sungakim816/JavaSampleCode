import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("textFileExercise19.txt"));
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
		String newImage = "";
		for (int row = 0; row < image.length; row++) {
			for (int col = 0; col < image[row].length; col++) {
				switch (image[row][col] / 8) {
				case 0:
					newImage += " ";
					break;
				case 1:
					newImage += ".";
					break;
				case 2:
					newImage += ",";
					break;
				case 3:
					newImage += "-";
					break;
				case 4:
					newImage += "+";
					break;
				case 5:
					newImage += "o";
					break;
				case 6:
					newImage += "O";
					break;
				case 7:
					newImage += "X";
					break;
				}

			}
			if (row % 2 == 1)
				newImage += "\n";
		}
		File newFile = new File("Exercise19result.txt");
		PrintWriter outputFile = new PrintWriter(newFile);
		outputFile.println(newImage);
		System.out.println("Result: ");
		System.out.println(newImage);
		System.out.println("You can view it again on " + newFile.getName() + "\nPath: " + newFile.getAbsolutePath());
		outputFile.close();

	}

}
