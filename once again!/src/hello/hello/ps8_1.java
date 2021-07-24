package hello;
class worker {
	int age;
	int salary;
	String name;
	public void print() {
		System.out.println("My name is " + name);
	    System.out.println("My age is " + age);
	    System.out.println(salary + "Rs is my monthly salary");
	}
}
public class ps8_1 {
	public static void main(String[] args) {
		// This is my my first custom class
		worker hemant= new worker();//Adding a new object
		hemant.age = 19;
		hemant.salary= 500000;
		hemant.name = "Harsh";
		//System.out.println(hemant.age);
		//System.out.println(hemant.name);
		hemant.print();

	}

}
