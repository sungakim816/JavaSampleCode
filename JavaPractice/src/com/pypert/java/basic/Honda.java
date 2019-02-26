/**
 * 
 */
package com.pypert.java.basic;

/**
 * @author Sunga
 *
 */
public class Honda implements Vehicle {

	/**
	 * 
	 */
	public Honda() {
		// TODO Auto-generated constructor stub
	}

	public void accelerate() {
		System.out.println("I'm accelerating");
	}

	public void brake() {
		System.out.println("Brake!");
	}

	public void start() {
		System.out.println("Start!");
	}

	public String getModel() {
		return "Honda";
	}
}
