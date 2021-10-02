package exercise_2;
import java.util.*;
public class second_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        Random  ab = new Random ();
        System.out.println("type 1 for paper , 2 for rock , 3 for  scissor");
        int player = sc.nextInt();
        int com = ab.nextInt(4);
        if(player == 1 && com == 2 || player == 2 && com == 3 || player == 3 && com == 1)  {
            System.out.println("player throws " + player);
            System.out.println("compuer throws " + com);
            System.out.println("you win");
        }
        else if(player == 2 && com == 1 || player == 3 && com == 2 || player == 1 && com == 3)  {
            System.out.println("player throws " + player);
            System.out.println("compuer throws " + com);
            System.out.println("you lose");
        }
        if(player == 2 && com == 2 || player == 3 && com == 3 || player == 1 && com == 1)  {
            System.out.println("player throws " + player);
            System.out.println("compuer throws " + com);
            System.out.println("tie");
        }
        
	}


}
