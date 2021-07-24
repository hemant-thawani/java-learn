package hello;

public class ps7 {
	//creating  methods 
//	static int comon(int x, int y) {
//	int z;
//	if (x<y) {
//		z = x+y;
//	}
//	else {
//		z = (x+y)*5;
//	}
//	return z;
//	}
	
	//creating method by overloading 
	static void foo() {
		System.out.println("have a nice day");
	}
	static void foo(String a) {
		System.out.println("have a nice day " + a);
	}
	//method without any return argument
	static void gm() {
		System.out.println("hello hemant how are you");
	}

	public static void main(String[] args) {
		//using by method
//		int g = 68;
//		int h = 48;
//		int f = comon(g,h);
//		System.out.println(f);
		
	 String a = "hemant";
	  //gm();
     // Today's topic is method overloading 
	    foo();
		foo(a);

	
     
}

	
}
	