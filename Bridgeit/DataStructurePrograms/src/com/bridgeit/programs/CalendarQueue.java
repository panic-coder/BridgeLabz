/**
 * Purpose: displaying calendar of entered month and year using queue implemented with linked list
 * 
 * @author Kumar Shubham
 * @since  11-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CalendarQueue {
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
		LinkedQueue<Integer> list[] = new LinkedQueue[6];
		for(int i=0;i<6;i++) {
			list[i]=new LinkedQueue();
		}
		for(int i=0;i<6;i++) {
			
			for(int j=0;j<7;j++) {
				
				list[i].add(calender[i][j]);
			}
		}
		for(int i=0;i<6;i++)
			list[i].display();
		
		
	}
}
