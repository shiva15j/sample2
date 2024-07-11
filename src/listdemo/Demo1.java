package listdemo;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		list.add(3);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(12);
		list.add(89);
		list.add(90);

		System.out.println("size=:" + list.size());
		System.out.println(list);

		System.out.println(" ");

		list.add(30);
		list.add(12);
		list.add(45);
		list.add(57);

		System.out.println("size=:" + list.size());
		System.out.println(list);

		System.out.println(" ");

		list.add(30);
		list.add(12);
		list.add(45);
		list.add(57);

		System.out.println(" ");
		System.out.println("size=:" + list.size());
		System.out.println(list);

		list.remove(1);
		list.remove(2);

		System.out.println(" ");
		System.out.println("size=:" + list.size());
		System.out.println(list);

		System.out.println(" ");

		// iterator

		for (Integer vl : list) {
			System.out.println(vl);
		}

	}

}
