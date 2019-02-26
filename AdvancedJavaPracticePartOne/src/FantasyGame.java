/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class FantasyGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int strengthPoint, healthPoint, luckPoint;
		String characterName;
		System.out.print("Welcome to Yertle's Quest\nEnter the name of your Character: ");
		characterName = scan.nextLine();
		System.out.print("Enter strength: ");
		strengthPoint = scan.nextInt();
		System.out.print("Enter health: ");
		healthPoint = scan.nextInt();
		System.out.print("Enter luck: ");
		luckPoint = scan.nextInt();
		if (strengthPoint > 10 || healthPoint > 10 || luckPoint > 10) {
			System.out.println("Invalid Value for character point.");
		} else if ((strengthPoint + healthPoint + luckPoint) > 15) {
			strengthPoint = healthPoint = luckPoint = 5;
			System.out.printf(
					"You have give your character too many points! Default values have been assigned:\n%s, strength: %d, health: %d, luck: %d",
					characterName, strengthPoint, healthPoint, luckPoint);
		} else {
			System.out.printf("%s, strength: %d, health: %d, luck: %d", characterName, strengthPoint, healthPoint,
					luckPoint);
		}

		scan.close();
	}

}
