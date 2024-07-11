package stringdemo;

public class Demo {

	public static void main(String[] args) {

		String name = "Punith";

		String name1 = "Punith";

		String name2 = new String("Punith");

		String name3 = new String("Punith");

		// .equals() :- compare the content of the String

		System.out.println(name.equals(name1));

		System.out.println(name1.equals(name2));

		System.out.println(name2.equals(name3));

		System.out.println(" ");

		// = :- It checks the memory location

		System.out.println(name == name1);

		System.out.println(name2 == name3);

		System.out.println(name1 == name3);

		System.out.println(" ");

		// toLowerCase()

		System.out.println(name.toLowerCase());

		// toUpperCase()

		System.out.println(" ");

		System.out.println(name.toUpperCase());

		// concat()

		System.out.println(" ");

		System.out.println(name.concat(name1));

		// contains()

		System.out.println(" ");

		System.out.println(name.contains("un"));

	}

}
