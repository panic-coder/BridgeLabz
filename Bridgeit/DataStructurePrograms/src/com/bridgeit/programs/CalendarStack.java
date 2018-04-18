/**
 * Purpose: displaying calendar of entered month and year using stack implemented with linked list
 * 
 * @author Kumar Shubham
 * @since  11-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CalendarStack<T> {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the month and year");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		int[][] calender = Utility.calenderQueue(month,year);
		String[] days = {"S","M","T","W","T","F","S"};
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+"  ");
		System.out.println();
		LinkedStack<Integer> list = new LinkedStack<>();
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				
				list.add(calender[i][j]);
			}
		}
		LinkedStackCalendar<Integer> listCalendar = new LinkedStackCalendar<>();
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				Integer temp = list.pop();
				listCalendar.add(temp);
			}
		}
		listCalendar.display();
	}
}
