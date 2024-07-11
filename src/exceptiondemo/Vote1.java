package exceptiondemo;

import java.util.Scanner;

public class Vote1 {

//	public void m1() throws Exception {
//		System.out.println("Hey this a method");
//	}

	public void election() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Vote");
		} else {
			throw new Exception("Invalid Age");
		}

	}

}
