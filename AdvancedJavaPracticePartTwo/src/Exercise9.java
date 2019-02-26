
import java.io.*;
import java.util.Arrays;

public class Exercise9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] signal;
		// { 5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4 };
		// compute the smoothed value for each
		// slot of the array smooth
		System.out.print("Smoothing Signal\n\nEnter numbers separated by space: ");
		signal = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] smooth = new int[signal.length];
		smooth[0] = (signal[0] + signal[1]) / 2;
		smooth[signal.length - 1] = (signal[signal.length - 2] + signal[signal.length - 1]) / 2;
		for (int i = 1; i <= smooth.length - 2; i++) {
			smooth[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
		}
		System.out.print("\nSignal: ");
		for (int j = 0; j < signal.length; j++) {
			System.out.print(signal[j] + " ");
		}
		System.out.print("\n\nSmooth Signal: ");
		for (int j = 0; j < smooth.length; j++) {
			System.out.print(smooth[j] + " ");
		}
		reader.close();
	}
}
