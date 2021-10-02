package chapter_14;

import java.util.Scanner;

public class ps14_2 {

	public static void main(String[] args) {
		// TODO Auto- method stub
        int [] num = new int [5] ;
        num [0] = 1111;
        num [1] = 999;
        num [2] = 888;
        num [3] = 777;
        num [4] = 666;
        
        // you can also try nesting try catch
        Scanner n =new Scanner(System.in);
        int a = n.nextInt();
        try {
        	System.out.println(num[a]);
        }
        catch(ArithmeticException e) {
      	  System.out.println("operation failed");
      	  System.out.println(e);
         }
        catch(Exception e) {
        	  System.out.println("operation failed");
        	  System.out.println(e);
           }
	}

}
