package hello;

public class ps7_2 {
	//recursion practice
	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}else {
	return	n * factorial(n-1);
		}
	}
	//varargs explanation
	static int hero(int ...arr) {
		int a=0;
		for (int b: arr) {
			a = a + b;
		}
		return a;
	}
	public static void main(String[] args) {
	System.out.println(hero(1,5,6,7,5));
	int b = factorial(8);
	System.out.println(b);
	
	
	
		
	}

}
