package exceptiondemo1;

public class Demo1 {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
