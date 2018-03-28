/*User Input and Replace String Template “Hello <<UserName>>, How are you?” 
I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name 
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Username {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = 1;
		String user = "";
		System.out.println("Enter Username");
		while (n > 0) {
			user = utility.inputString();
			if (user.length() < 3)
				System.out.println("Please Ensure UserName has \nminimum 3 characters ");
			else
				n--;
		}
		utility.username(user);
	}
}
