/**
 * Purpose: Taking input "String" and print "hi String".  
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Username {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = 1;
		String user = "Hello <<UserName>>, How are you?";
		String userName="";
		System.out.println("Enter Username");
		while (n > 0) {
			userName = utility.inputString();
			if (userName.length() < 3)
				System.out.println("Please Ensure UserName has \nminimum 3 characters ");
			else
				n--;
		}
		System.out.println(utility.replaceUsername(userName,user));
	}
}
/*28-March-2018*/