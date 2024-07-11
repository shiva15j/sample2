package exceptiondemo;

import java.util.Scanner;

public class Vote {

	// throws:- method signature
	public void method() throws Exception {

		System.out.println("I am a compile time example");

	}

	public void election() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			throw new Exception("Invalid Age");
		}

	}

}
