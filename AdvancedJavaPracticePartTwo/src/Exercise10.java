
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Exercise10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("CoffeeData.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> dataPoints = new ArrayList<String>();
		double[] data;
		double average, newAverage, distantValue, totalSum;
		String st;

		while ((st = reader.readLine()) != null) {
			dataPoints.add(st);
		}

		data = dataPoints.stream().mapToDouble(i -> Double.parseDouble(i.trim())).toArray();

		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}

		totalSum = DoubleStream.of(data).sum();
		average = totalSum / data.length;
		Arrays.sort(data);
		distantValue = ((average - data[0]) > (data[data.length - 1] - average)) ? data[0] : data[data.length - 1];
		newAverage = (totalSum - distantValue) / (data.length);

		System.out.println("Average: " + average);
		System.out.println("Most distant value: " + distantValue);
		System.out.println("New Average: " + newAverage);

		reader.close();
	}

}
