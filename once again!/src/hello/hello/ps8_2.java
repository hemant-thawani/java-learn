package hello;
import java.util.Scanner;
class Employee{       // solution problem 1
	int salary;
	String name;
	public int getsalary()  {
		System.out.println("Enter your monthly/yearly earning user");
		Scanner s = new Scanner(System.in);
		salary = s.nextInt();
		return salary;
	}

	public String  setname(String n) {
	name = n;
	return name;
	}
}
class smartphone{         //solution problem 2
	public void features() {
		System.out.println("ringing");
		System.out.println("vibrating");
	}
}
class square{                 //solution problem 3
	int length;
	public int area(){
		int a = length * length;
		System.out.println("the area ofthe square is");
		return a;
	}
	public int perimeter() {
		int b = length*4;
		System.out.println("the perimeter of square is");
		return b;
	}
}
class rectangle{                 //solution problem 4
	int length;
	int breadth;
	public int area(){
		int a = length * breadth;
		System.out.println("the area of rectangle is");
		return a;
	}
	public int perimeter() {
		int b =2*(length+breadth);
		System.out.println("the perimeter rectangle is");
		return b;
	}
}

public class ps8_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//problem 1 solved	
//    Employee harsh = new Employee();
//    harsh.name = "Hemant";
//    System.out.println(harsh.getsalary());
//    harsh.setname("harsh");
//    System.out.println(harsh.name);
		
    //problem 2 solved  
//		smartphone apple = new smartphone();
//		apple.features();
	  
	//problem 3 solved 
//		square garden = new square();
//		garden.length = 33;
//		System.out.println(garden.area());
//		System.out.println(garden.perimeter());
		
		//problem 4 solved 
//		rectangle garden = new rectangle();
//		garden.length = 27;
//		garden.breadth = 48;
//		System.out.println(garden.area());
//		System.out.println(garden.perimeter());

	}

}

