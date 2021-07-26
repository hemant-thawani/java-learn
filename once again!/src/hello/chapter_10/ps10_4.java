package chapter_10;

class A {
	int i;
	public A(int v) {
		i = v;
	}
	public void math1(){
		System.out.println("The variable A has value "+ i);
	}	
}
class B extends A {
	public B(int v) {
		super(v);
	}
	public void math1(){            //method overriding of method math1
		System.out.println("The variable B has value "+ i);
	}
	public void math2() {
		System.out.println("The variable B has value "+ i);
	}
}
public class ps10_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(37);

	}

}
