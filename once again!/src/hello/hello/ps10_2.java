package hello;

class basic{
	public basic() {
		System.out.println("Printing through a constructor");
	}
	public basic(int a) {
		System.out.println("Printing through a constructor " + a);
	}
	
}
class advance extends basic{
	public advance() {
		//super (0);
		System.out.println("Printing through advance  constructor");
	}
	public advance(int a, int b) {
		super(a);
		System.out.println("Printing through advance constructor with custom value of "+ a + " " + b );
	}
}

class superAdvance extends advance{
	public superAdvance(int x, int y, int z) {
		super(x,y);
		System.out.println("Printing through a super Advance constructor "+ x + " " + y + " " + z);
	}
}

public class ps10_2 {
	public static void main(String[] args) {
		//basic h = new basic();  // no need to create object for a super class
		                          // when we can access all the elements of super class through subclass
		//advance b= new advance(8,9);
		
		superAdvance hero = new superAdvance(7,33,22);
		

	}

}
