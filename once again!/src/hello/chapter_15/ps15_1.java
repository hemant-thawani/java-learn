package chapter_15;
// from this chapter there will be notes of advance java
// today's topic is array list  and linkedlist

import java.util.*;

public class ps15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int [5] ; // normal array 
		ArrayList <Integer> l1 = new ArrayList<>(); // Arraylist or modified array
		l1.add(7);
		l1.add(3);
		l1.add(1);
		l1.add(5);
		l1.add(9);
		l1.add(0,8); //adding 8 to index 0
		for (int i =0; i<l1.size(); i++) {
		l1.get(i);
		}
		

	}

}
