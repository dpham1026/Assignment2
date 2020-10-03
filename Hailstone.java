/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		println ("Enter a number to start the Hailstone sequence:"); int n = readInt();
		int n2 = n;
		int j = 1;
		
		while (n != 1) {
			n2 = n;
			if (n %2 ==0) {
				n2 /= 2;
				println (n + " is even, so I take half: " + n2);
				n = n2;
			} else {
				n2 = (3*n + 1);
				println (n + " is odd, so I make 3n+1: " + n2);
				n = n2;
			}
			j++;
		}
		println ("This process took " + j + " steps to reach 1.");
	}
}




/* If there is no remainder (% == 0) after dividing n 
by 2, it is even. 
If there is a remainder (% == 1)
then there is 1 left over.
n is odd.
*/