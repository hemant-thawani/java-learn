package hello;
//This topic is extremely important #59

interface bicycle1 {
	int a = 57;
	void brake();
	void speed();
}

class NewCycle implements bicycle1{
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

interface camera1{
	void takesnap();
	void record();
}

class MyPhone1 implements camera1{
	public void takesnap() {
		System.out.println("Taking selfies");
	}
	public void record() {
		System.out.println("3,2,1 action");
	}
	public void google() {
		System.out.println("Say ok google");
	}
}
public class ps11_3 {
	public static void main(String[] args) {
		camera1 i = new MyPhone1();
	//	i.google();    //not allowed
		i.takesnap();
		

	}

}
