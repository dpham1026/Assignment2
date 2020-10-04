
import acm.program.*;
import java.util.Scanner;


public class FibonacciTerms extends ConsoleProgram {
	
	public static void main(String[] args) {
		int count, n1= 0, n2 =1; 
	    System.out.print("How many terms do you want in the sequence: ");
	    Scanner scanner = new Scanner(System.in); //Store user input 
	    count = scanner.nextInt(); //The number store for user input
	    scanner.close();
	  
	    int i =1; //initiate while loop starting at 1, for user input correctiveness
		while(i <=count) 
			{
				System.out.println(n1 + " ");
				int sumPrevTwo = n1 + n2;
				n1 = n2;
				n2 = sumPrevTwo;
				i++;
			
			}
		
		}
	
}