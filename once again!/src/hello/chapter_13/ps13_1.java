package chapter_13;
//there are two ways of creating thread in java
//today i am going to create thread by extending class
class multitask extends Thread{
	  public void run() {
		  int i =0;
		  while(i<100) {
		  System.out.println("This is my first thread");
		  i++;
		  }
	  }
  }

class multitask2 extends Thread{
	  public void run() {
		  int i = 0;
		  while(i<100) {
		  System.out.println("My thread is running again");
		  i++;
		  }
	  }
}

public class ps13_1 {
	  public static void main(String[] args) {
		  multitask typing = new multitask();
		  typing.start();      // to run a thread you need to call start function or 
		                       //method run of thread class
		  multitask2 cooking =new multitask2();
		  cooking.start();
		  
	  }

}
