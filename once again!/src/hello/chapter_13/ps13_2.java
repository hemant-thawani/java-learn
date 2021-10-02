package chapter_13;
// in this part i am learning how to create thread using runnable interface
class myThread implements Runnable{
	public void run() {
		System.out.println("I am a thread");
	}
}

class myThread1 implements Runnable{
	public void run() {
		System.out.println("I am a second thread");
	}
}

public class ps13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread work = new myThread();
		myThread1 work1 = new myThread1();
		Thread t1 = new Thread(work);
		Thread t2 = new Thread(work1);
		t2.start();
		t1.start();
	}

}
