package inheritdemo;

public class Humanmain {

	public static void main(String[] args) {

		Parent pp = new Parent();

		pp.eat();
		pp.sleep();

		System.out.println(" ");

		Child cc = new Child();

		cc.eat();
		cc.sleep();
		cc.walk();
		cc.run();

		System.out.println(" ");

		Grandchild gg = new Grandchild();
		gg.read();
		gg.write();
		gg.eat();
		gg.sleep();
		gg.walk();
		gg.run();

		System.out.println(" ");

		Child1 cd = new Child1();

		cd.learn();
		cd.talk();
		cd.eat();
		cd.sleep();

	}

}
