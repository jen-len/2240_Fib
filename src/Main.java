/* Jennifer Lennick 
 * 0627839
 * Program: Fibonacci Program
 * User will enter a number an the program will 
 * print the series up until the user entered value.
 * 
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int userInput = 0; 
		int fibSeries = 0; 
		
			// Welcome the user
			System.out.println("Welcome to the Fibonacci Sequence Program");
			
			//acquire userInput
			System.out.println("Please Enter a number less than 50 =>");
			userInput = reader.nextInt();
			reader.close();
			System.out.println("UserInput=>" + userInput);
			
			//starting recursive function time
			long startTime = System.nanoTime();
			//recursive function print out
			for(int i = 0; i < userInput;i++ ) {
				fibSeries = fiboSeriesRec(i);
				System.out.print(fibSeries+" ");
			}
			long endTime = System.nanoTime();
			long timeElapsed = endTime- startTime;
			 System.out.println("\n\n Recursive Method: Elapsed time is: " + timeElapsed+ " nanoseconds");	
			
			//starting iterative function time
			startTime = System.nanoTime();
			 //iterative function print out
			 for(int i = 0; i < userInput;i++ ) {
					fibSeries = fiboSeriesIte(i);
					System.out.print(fibSeries+" ");
				} 
			 endTime = System.nanoTime();
			 timeElapsed = endTime- startTime;
			 System.out.println("\n\n Iterative Method:Elapsed time in nanoseconds is: " + timeElapsed+ " nanoseconds");	
			
	}
		// fiboSeriesRec a recursive function that calls itself
		
		public static int fiboSeriesRec(int x){
			
			if (x == 0) 
				return 0;
			else if (x == 1)
				return 1;
			else
				return (fiboSeriesRec(x - 1) + fiboSeriesRec(x - 2)); 		
			
		}
		
		//fiboSeriesIte: iterative function that uses a for loop
		// (1) https://stackoverflow.com/questions/21710756/recursion-vs-iteration-fibonacci-sequence
		public static int fiboSeriesIte(int x){
			int fib1 = 0, fib2 = 1, fib3 =1;  
			for (int i = 0; i < x; i++) {
				fib1 = fib2;
				fib2 = fib3;
				fib3 = fib1 + fib2; 
			}
			return fib1; 
		}

}