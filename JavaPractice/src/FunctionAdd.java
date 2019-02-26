

public class FunctionAdd {
	public static int get_sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		System.out.println(get_sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}
