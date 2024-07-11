package exceptiondemo12;

import java.util.Scanner;

public class Demo {

	public void vision() throws Exception {

		System.out.println("i am a method");

	}

	public void vote() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			throw new Exception("You can not vote");
		}

	}

}
