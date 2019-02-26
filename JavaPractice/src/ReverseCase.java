

public class ReverseCase {
	public static void main(String[] args) {
		char[] char_arr = args[0].toCharArray();
		for (int i = 0; i < char_arr.length; i++) {
			if (Character.isLowerCase(char_arr[i])) {
				char_arr[i] = Character.toUpperCase(char_arr[i]);
			} else if (Character.isUpperCase(char_arr[i])) {
				char_arr[i] = Character.toLowerCase(char_arr[i]);
			}
		}
		String reversed = new String(char_arr);
		System.out.println(reversed);
	}
}
