package com.pypert.java.basic;
import java.io.IOException;

public class ClearScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (System.getProperty("os.name").startsWith("Windows")) {
				System.out.println("Hello");
				Runtime.getRuntime().exec("pause");
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		}catch (IOException e) {
			
		}
	}
}
