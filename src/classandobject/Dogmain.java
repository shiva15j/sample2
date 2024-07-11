package classandobject;

public class Dogmain {

	public static void main(String[] args) {

		Dog dd = new Dog();

		dd.color = "white";

		System.out.println(dd.color);

		System.out.println(dd.tail);

		dd.eat();
		dd.sleep();
		dd.bark();

		System.out.println(" ");

		Dog dg = new Dog("German Shpefard");

		dg.color = "black";

		System.out.println(dg.color);

		System.out.println(dg.tail);

		dg.eat();
		dg.sleep();
		dg.bark();

	}

}
