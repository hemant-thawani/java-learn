package hello;
class newjava2{
	private int num;
	private String name;
	public newjava2(String I, int g){
		num = g;
		name = I;
	}
	public newjava2(String I){
		num = 33;
		name = I;
	}
	public newjava2(int g){
		num = g;
		name = "hemant";
	}
	public String getname (){
	  return name;
	}
	public void fixname(String n){
		name = n;
	}
	public int getnum(){
	 return num;
	}
	public void fixnum(int n){
		num =n;
	}
}
public class ps9_2 {

	public static void main(String[] args) {
	    newjava2 harsh = new newjava2("Harsh", 55);
	   // The constructor helps us to assign default value in the attributes  
	   // harsh.fixname("Harsh");
	   // harsh.fixnum(58);
	    
	    System.out.println(harsh.getname());
		System.out.println(harsh.getnum());

	}

}
