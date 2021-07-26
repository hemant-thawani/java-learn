package chapter_9;
class newjava{
	private int num;
	private String name;
	public String getname (){    //getter
	  return name;
	}
	public void fixname(String n){  //setter
		name = n;
	}
	public int getnum(){   //getter
	 return num;
	}
	public void fixnum(int n){  //setter
		num =n;
	}
}
public class ps9_1 {
	public static void main(String[] args) {
		//today's topic is access modifiers
		newjava harsh = new newjava();
		//harsh.num = 88;
		//harsh.name = "Harsh";
		harsh.fixname("Harsh");
		harsh.fixnum(100000);
		System.out.println(harsh.getname());
		System.out.println(harsh.getnum());

	}

}
