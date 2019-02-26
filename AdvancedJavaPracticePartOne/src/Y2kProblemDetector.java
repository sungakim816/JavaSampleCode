/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Y2kProblemDetector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int yearOfBirth, currentYear, age;
		System.out.print("Year of Birth: ");
		yearOfBirth = scan.nextInt();
		System.out.print("Current year: ");
		currentYear = scan.nextInt();
		if (currentYear < yearOfBirth)
			currentYear += 100;
		age = currentYear - yearOfBirth;
		System.out.println("Your age: " + age);
		scan.close();

	}

}
