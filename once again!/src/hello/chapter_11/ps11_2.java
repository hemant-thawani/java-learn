package chapter_11;
// this class has conbined code of #56 and #57
interface bicycle {
	int a = 57;
	void brake();
	void speed();
}

class New_cycle implements bicycle{
	void horn() {
		System.out.println("trin trin");
	}
	public void brake() {
		System.out.println("Using brakes");	
	}
	public void speed() {
		System.out.println("Speeeeeding up");
	}
}

// below is the code of #57
interface camera{
	void takesnap();
	void record();
}

class MyPhone implements camera{
	public void takesnap() {
		System.out.println("Taking selfies");
	}
	public void record() {
		System.out.println("3,2,1 action");
	}
}
public class ps11_2 {
	public static void main(String[] args) {
		New_cycle hero = new New_cycle();
		hero.brake();
		

	}

}
