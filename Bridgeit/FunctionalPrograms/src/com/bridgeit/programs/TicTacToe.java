/*Cross Game or Tic-Tac-Toe Game 
Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
Logic -> The User or the Computer can only take the unoccupied cell. The Game is played till either wins or till draw...
O/P -> Print the Col and the Cell after every step.
Hint -> The Hints is provided in the Logic. Use Functions for the Logic…
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TicTacToe {
	public static void main(String[] args) {
		Utility utility = new Utility();
		utility.ticTacToe();
	}
}
/*29-March-2018*/