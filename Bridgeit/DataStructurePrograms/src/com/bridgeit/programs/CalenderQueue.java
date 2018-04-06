package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CalenderQueue {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the month and year");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		int[][] calender = Utility.calenderQueue(month,year);
		String[] days = {"S","M","T","W","T","F","S"};
		LinkedQueue<LinkedQueue> list1 = new LinkedQueue<LinkedQueue>();
		LinkedQueue<Integer> list = new LinkedQueue<Integer>();
		for(int i=0;i<6;i++) {
			
			for(int j=0;j<7;j++) {
				//System.out.print(calender[i][j]+"  ");
				
				list.add(calender[i][j]);
			}
			list1.add(list);
			//System.out.println();
		}
		list1.display1();
		
		
	}
}
