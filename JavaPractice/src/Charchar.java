

import java.util.*;

public class Charchar {

	static char[] sort_array(char[] char_arr, int len) {
		char temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (char_arr[j] > char_arr[j + 1]) {
					temp = char_arr[j];
					char_arr[j] = char_arr[j + 1];
					char_arr[j + 1] = temp;
				}
			}
		}
		return char_arr;
	}

	static boolean isAnagram(String a, String b) {
		char[] strArray1 = a.toLowerCase().toCharArray();
		char[] strArray2 = b.toLowerCase().toCharArray();
		String sortedString1 = new String(sort_array(strArray1, a.length()));
		String sortedString2 = new String(sort_array(strArray2, b.length()));
		if (a.length() != b.length()) {
			return false;
		} else if (sortedString1.equals(sortedString2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = scan.nextLine();
		System.out.print("Enter a another string: ");
		String b = scan.nextLine();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? a + " and " + b + " is Anagrams" : a + " and " + b + " is Not Anagrams");
	}
}
