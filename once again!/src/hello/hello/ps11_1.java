package hello;

abstract class hi {          // we can't make object of this class
	public hi() {
		System.out.println("hi i am a constructor");
	}
	public void Say_hi() {
		System.out.println("Say hi to everyone");
	}
	abstract public void greet();
}

class hello extends hi {
	public void greet() {
		System.out.println("hello everyone");
	}
}
public class ps11_1 {
	public static void main(String[] args) {
		

	}

}
