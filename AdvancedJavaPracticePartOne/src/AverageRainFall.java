

public class AverageRainFall {
	public static void main(String[] args) {
		double aprilVal = 12, mayVal = 14, juneVal = 8, average = 0.0;

		average = (aprilVal + mayVal + juneVal) / 3;

		System.out.println("Rainfall for April:\t" + aprilVal + "\n" + "Rainfall for May:\t" + mayVal + "\n"
				+ "Rainfall for June:\t" + juneVal + "\n" + "Average rainfall:\t" + average);
	}
}
