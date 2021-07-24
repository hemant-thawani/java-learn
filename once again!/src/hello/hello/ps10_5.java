package hello;
class again {
	public void greeting() {
		System.out.println("good morning master");
	}
	public void name() {
		System.out.println("hello once again");
	}
}

class again_and_again extends again{
	public void suprabhat() {
		System.out.println("Suprabhat asha hai ki apka din acha jaye");
	}
	public void name() {
		System.out.println("hello again and again");
	}
}
public class ps10_5 {
	public static void main(String[] args) {
		again i = new again_and_again();
		i.name();   // The name method of again_and_again will be executed
		//i.suprabhat; // not allowed

	}

}
