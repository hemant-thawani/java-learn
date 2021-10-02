package chapter_14;

public class ps14_1 {

	public static void main(String[] args) {
       int a =0;
       int b = 67;
       try {
    	   int c = a/b;
    	   System.out.println(c);
       }
       catch(Exception e) {
    	  System.out.println("operation failed");
    	  System.out.println(e);
       }
       
	}

}
