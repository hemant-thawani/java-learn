package hello;
// Question no. 1 attempt
abstract class pen{
	abstract public void Write();
	abstract public void Refill();
}

class Ballpen extends pen{

	@Override
	public void Write() {
		System.out.println("Write in a good handwriting");
	}

	@Override
	public void Refill() {
		System.out.println("Ink is over ");
		System.out.println("Refill the ink now");
	}
	
}

// Question no. 3 attempt 
interface Monkey {
	void jump();
	void bite();
}

class human implements Monkey{

	@Override
	public void jump() {
		System.out.println("Jump like a monkey");
	}

	@Override
	public void bite() {
		System.out.println("bite like a monkey");
	}
	
	public void eat() {
		System.out.println("Eat with manners");
	}
	
	public void sleep() {
		System.out.println("Sleep on bed");
	}
}

//I don't need to do all question of practice set because they are not quality question

public class ps11_4 {
	public static void main(String[] args) {
		Monkey me =new human();
		me.jump();
		//me.eat(); // not allowed

	}

}
