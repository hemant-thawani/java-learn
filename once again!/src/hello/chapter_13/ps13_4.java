package chapter_13;

class NT extends Thread {
	public NT(String name) {
		super (name);
	}
	public void run(){
		System.out.println("hi User " + getName());
	}
}

public class ps13_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NT h = new NT("hemant");
	    NT h1 = new NT("hemant1");
		NT h2 = new NT("hemant2");
		NT h3 = new NT("hemant3");
		h.start();
		h1.start();
		h2.start();
		h3.start();
		h3.setPriority(Thread.MAX_PRIORITY);
		
        
	}

}
