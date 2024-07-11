package listdemo;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Shivam");

		map.put(2, "Punith");

		map.put(3, "Aftaab");

		map.put(4, "Shivram");

		// System.out.println(map);

		// iterator
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
