package chapter_14;

import java.util.Scanner;

class Ex extends Exception{
	public String toString() {
		return "Hello";
	}
	public String getMessage(){
		return "Hi User";
	}
}

public class ps14_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a<100) {
			try {
				throw new Ex();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
