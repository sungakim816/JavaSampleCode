

import java.util.Scanner;

public class ValueOfAQuadratic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, value;
//		double a, b, c;
		// y = ax^2 + bx + c
//		System.out.print("a: ");
//		a = scan.nextDouble();
//		System.out.print("b: ");
//		b = scan.nextDouble();
//		System.out.print("c: ");
//		c = scan.nextDouble();
		System.out.println("Equation: 3x^2 -8x + 4");
		System.out.print("x: ");
		x = scan.nextDouble();
		value = 3 * Math.pow(x, 2) + (-8 * x) + 4;
		System.out.println("Result: " + value);
		
		scan.close();
	}
}