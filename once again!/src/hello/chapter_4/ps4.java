package chapter_4;

import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         System.out.println("how old are you ?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("you are an adult");
        }
        else if (age > 13) {
        	System.out.println("you are a teenager");
        }
        else {
        	System.out.println("you are a child");
        }

        //boolean a = true;
        //boolean b = false;
        //boolean c = true;
        //if (a && b || c) {
        //System.out.println("yay");
        //}
        //else {
        //System.out.println("my bad!");
        //}

		/*switch(age)
		case 18 ->
			System.out.println("you are going to become adult!");
		case 21 ->
			System.out.println("its time to have a job now");
		case 60 ->
			System.out.println("its time for retirement");
		default ->
            System.out.println("enjoy the journey of your life");

		*/


    }
}
