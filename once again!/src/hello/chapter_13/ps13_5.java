package chapter_13;
class multitask1 extends Thread{
	  public void run() {
		  int i =0;
		  while(i<100) {
		  System.out.println("This is my first thread");
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  i++;
		  }
	  }
}

class NT1 extends Thread {
	public void run(){
		int i = 0;
		while(i<100) {
		System.out.println("hi User " );
	    i++;
	    }
	}
}


public class ps13_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multitask1 h = new multitask1();
		NT1 h1 = new NT1();
		h.start();
//	    try {
//			h.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		h.interrupt();
        h1.start();
        
	}

}
