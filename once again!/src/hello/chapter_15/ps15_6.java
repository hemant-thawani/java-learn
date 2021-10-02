package chapter_15;

import java.util.Calendar;
// today we are gonna explore calendar class


public class ps15_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.get(Calendar.SECOND));

	}

}
