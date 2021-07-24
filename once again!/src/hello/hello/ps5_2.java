package hello;

public class ps5_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Question 1: write a program to print the following pattern
        //*****
        //****
        //***
        //**
        //*
        //solution 1
		/*for (int i = 5 ; i > 0; i-- ) {
		   for (int j = 0 ;j < i; j ++  ) {
			   System.out.print("*");
		   }
		   System.out.print("\n");
		}*/
        //solution 2
		 /*String str = "*";
	        for (int i = 4; i >0; i--) {
	        	System.out.println(str.repeat(i));
	        }*/

        //Question 2: write a program to sum first even numbers
		/*int sum = 0 ;
        int n = 4;
        int i = 0;
        while(i < n) {
        	 sum = sum + i*2;
        	 i++;
         }
        System.out.print(sum);*/

        //Question 3: write a program to print multiplication table of given number n
        /*int num = 5;
        for (int i = 1; i < 11; i++) {
    	   System.out.printf("%d x %d = " , num , i );
    	   System.out.println(num*i);
         }*/

        //Question 4: write a program to print multiplication of 10 in reverse order
	 /* int n = 10;
		int i = 10;
		while(i>0) {
			System.out.print( n + " x " + i + " = ");
			System.out.println(n*1);
			i--;
			}*/

        //Question 5: write a program to factorial of given number
        //int x = 5;
        //int fact = 1;
        //int z = 5;
        //while (z>0) {
        //   fact =	fact*z;
        //   z--;
        //}
        //System.out.println(fact);

    }

}
