package com.pypert.java.basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AlphabeticalOrder {
	public static Scanner scan = new Scanner(System.in);

	public static ArrayList<String> sortWordByFirstLetter(ArrayList<String> words) {
		int i = 1, array_size = words.size();
		while (i < array_size) {
			int j = i - 1;
			while (j >= 0 && (words.get(j + 1).toLowerCase().charAt(0) < words.get(j).toLowerCase().charAt(0))) {
				String temp = words.get(j);
				words.set(j, words.get(j + 1));
				words.set((j + 1), temp);
				j--;
			}
			i++;
		}
		return words;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("alphabeticalOrderTextInput.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array_of_words = new ArrayList<>();
		String temp;
		while ((temp = reader.readLine()) != null) {
			if (temp.length() != 0)
				array_of_words.add(temp.trim());
		}
		ArrayList<String> sorted_words = sortWordByFirstLetter(array_of_words);
		int longest_string_size = IntStream.range(0, sorted_words.size()).map(i -> sorted_words.get(i).length())
				.sorted().toArray()[sorted_words.size() - 1];
		for (int current_char = 1; current_char <= longest_string_size; current_char++) { // iterations for every char
			for (int i = 1; i < sorted_words.size(); i++) { // iterations for every word
				for (int j = i - 1; j >= 0; j--) { // algorithm for alphabetizing letters
					boolean isSwapped = false;
					try {
						String current = sorted_words.get(j + 1);
						String previous = sorted_words.get(j);
						if (current.substring(0, current_char).toLowerCase()
								.equals(previous.substring(0, current_char).toLowerCase())) {
							if (current.length() == current_char || (current.toLowerCase()
									.charAt(current_char) < previous.toLowerCase().charAt(current_char))) {
								sorted_words.set(j + 1, previous);
								sorted_words.set(j, current);
								isSwapped = true;
							}
						}
					} catch (StringIndexOutOfBoundsException e) {
						continue;
					}
					if (!isSwapped) {
						break;
					}
				}
			}
		}
		for (String i : sorted_words) {
			System.out.print(i + "\n");
		}
	}
}
