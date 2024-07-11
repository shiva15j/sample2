package loopdemo;

public class Demo1 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			// sum = 0+1=1
			// sum= 1+2=3
			// sum = 3+3=6
			// sum = 6+4

		}
		System.out.println("The sum = :" + sum);

	}

}
