package chapter_13;
class gm extends Thread {
	public void run() {
    for (int i=0; i<10; i++) {
    	System.out.println("Good morning ");
    }
}
}

class welcome extends Thread {
	public void run() {
    for (int i=0; i<10; i++) {
    	System.out.println("welcome");
    }
    try {
		Thread.sleep(200);
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}

public class ps13_6 {
	public static void main(String[] args) {
	

	}

}
