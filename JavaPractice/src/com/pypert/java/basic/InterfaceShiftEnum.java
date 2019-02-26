package com.pypert.java.basic;
/**
 * @author Sunga
 *
 */
public class InterfaceShiftEnum {

	/**
	 * @param args
	 */
	static enum DAY {
	Sun, Mon, Tue, Wed, Thu, Fri, Sat
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Honda();
		car.start();
		car.accelerate();
		car.brake();
		System.out.println("Car Model: " + car.getModel());
		for (int i = 1; i < 10; i++) {
			System.out.println(1 << i);
		}

		for (DAY instance : DAY.values()) {
			System.out.print(instance + " ");
		}
	}
}
