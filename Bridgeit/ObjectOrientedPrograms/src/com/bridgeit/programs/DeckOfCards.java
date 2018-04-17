/**
 * Purpose: Displaying
 * 
 * @author Kumar Shubham
 * @since 17-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class DeckOfCards {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String[] cards = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] names = {"Clubs","Diamonds","Hearts","Spades"};
		int number=0;
		int deck[][] = utility.suffle();
		System.out.println("Before sorting \n==============");
		for(int i=0;i<4;i++) {
			System.out.print(names[i]+" : ");
			for(int j=0;j<9;j++) {
				number = deck[i][j];
				System.out.print(cards[number]+" ");
			}
			System.out.println("");
		}
		System.out.println("\n============================================\n");
		deck = utility.sort(deck);
		System.out.println("After sorting \n==============");
		for(int i=0;i<4;i++) {
			System.out.print(names[i]+" : ");
			for(int j=0;j<9;j++) {
				number = deck[i][j];
				System.out.print(cards[number]+" ");
			}
			System.out.println();
		}
		
	}
}
