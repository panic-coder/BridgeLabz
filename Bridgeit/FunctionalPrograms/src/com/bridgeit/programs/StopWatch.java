/*Simulate Stopwatch Program
Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
I/P -> Start the Stopwatch and End the Stopwatch
Logic -> Measure the elapsed time between start and end
O/P -> Print the elapsed time.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter 1 to start time");
		long start = utility.inputInteger();
		start = System.currentTimeMillis();
		System.out.println("Enter 0 to stop time");
		long stop = utility.inputInteger();
		stop = System.currentTimeMillis();
		System.out.println("Elapsed time = "+(stop-start)+" milliseconds");
	}

	
}
/*28-March-2018*/