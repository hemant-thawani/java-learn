package hello;
class Once{
	int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	Once(int v){
	   a=v;
	}
	public int one(){
		return 1;
	}
}

public class ps10_3 {
	public static void main(String[] args) {
		Once e = new Once(55);
		System.out.println(e.getA());
		

	}

}
