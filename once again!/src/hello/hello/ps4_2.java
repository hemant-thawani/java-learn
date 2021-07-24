package hello;

public class ps4_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //QUESTION 1: What will be the output of following program
		/*int a = 10;
		if(a = 11) {
			System.out.println("I am 11");
		}
		else {
			System.out.println("I am not 11");
		}*/

        //QUESTION 2: Write a program to find out whether a student is pass or fail
        //if it requires total 40% and at least 33% in each subject to pass assume
        //three subjects and take marks as an input from user

        //Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter your marks of english");
		int s1 = sc.nextInt();
		System.out.println("Enter your marks of hindi");
		int s2 = sc.nextInt();
		System.out.println("Enter your marks of marathi");
		int s3 = sc.nextInt();
		float avg = (s1 + s2 +s3)/3.0f;
		if (avg >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
			System.out.println("you are pass CONGRATULATIONS!");
			}
		else {
			System.out.println("better luck next time");
		}*/

        //QUESTION 3: Calculate income tax paid by an employee to goverment as
        //as per the slabs metioned below

		/*float tax = 0;
		float income = sc.nextFloat();
		if (income <= 2.5f) {
			tax = tax + 0;
		}
		else if (income > 2.5f && income <= 5f) {
			tax = tax + 0.05f * (income - 2.5f);
		}
		else if (income > 5f && income <= 10f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (income - 5.0f);
		}
		else if (income > 10.0f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (10.0f - 5.0f);
			tax = tax + 0.3f * (income - 10f);
		}
		System.out.println(tax);*/

        //QUESTION 4 :Write ajava program to find out the day of the week given the
        //number [ 1 for monday , 2 for tuesday ... and so on !]

        /*int num = sc.nextInt();
        System.out.println("Please enter days of ")
        if (num == 1) {
	         System.out.println("MONDAY");
        }
        else if (num == 2) {
	         System.out.println("TUESDAY");
        }
        else if (num == 3) {
	         System.out.println("WEDNESDAY");
        }
        else if (num == 4) {
	       System.out.println("THURSDAY");
        }
        else if (num == 5) {
	       System.out.println("FRIDAY");
        }
        else if (num == 6) {
	       System.out.println("SATURDAY");
        }
        else if (num == 7) {
           System.out.println("SUNDAY");
        }
        else {
        	System.out.println("you entered wrong number");
        }*/

        //QUESTION 5: Write a java program to find whether a year entered by user
        //is leap year or not

		/*Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean leap = true;
		if (year % 4 == 0 && year % 400 == 0) {
			leap = true;
		}
		else if (year % 100 == 0) {
			leap = false;
		}

		if (leap) {
			System.out.println("The year " + year + " is a leap year. ");
		}
		else {
			System.out.println("The year " + year + " is not a leap year");
		}*/

        //QUESTION 6 Write a program to find  the type of website from the URL
        // .com - commercial website
        // .org - organization website
        // .in  - indian website

		/*Scanner sc = new Scanner(System.in);
		String  website = sc.next();
		if (website.endsWith(".com")){
			System.out.println("commercial website");
		}
		else if (website.endsWith(".org")) {
			System.out.println("organization website");
		}
		else if (website.endsWith(".in")) {
			System.out.println("indian website");
		}*/

    }
}
