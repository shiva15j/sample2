package modifiredemo;

public class Demo {

	// Public :- all over the project
	public void PublicM() {
		System.out.println("Public Method");
	}

	// It is accessible only inside the class
	private void PrivateM() {
		System.out.println("Priavte Method");
	}

	// It is accessible inside the package only , but if you want to access it
	// Outside the package you need to do inheritance
	protected void ProctedM() {
		System.out.println("Protected Method");
	}

	// It is accessible only inside the package
	void DefaultM() {
		System.out.println("Default Method");
	}

	public static void main(String[] args) {

		Demo dd = new Demo();
		dd.PublicM();
		dd.PrivateM();
		dd.ProctedM();
		dd.DefaultM();
	}

}
