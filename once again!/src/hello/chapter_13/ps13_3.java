package chapter_13;

class NewThread extends Thread {
	public NewThread(String name) {
		super (name);
	}
	public void run(){
		System.out.println("hi User");
	}
}

public class ps13_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NewThread h = new NewThread("hemant");
        h.start();
        long a = h.getId();
        System.out.println(a);
	}

}
