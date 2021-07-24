package hello;
class foundation{
	int x;
	public int getx() {
		return x;
	}
	public int setx(int v) {
		return x = v;
	}
	public void print(){
		System.out.println("i am a great android devloper");
	}
}

class building extends foundation{
	int y;
	public int gety() {
		return y;
	}
	public int sety(int v) {
		return y =v;
	}
	
}

public class ps10_1 {
	public static void main(String[] args) {
	     building b = new building();
	     b.setx(55);
	     System.out.println(b.getx());
	     

	}

}
