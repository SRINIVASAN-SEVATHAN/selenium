package episode42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:\n");
		Scanner sc = new Scanner(System.in);
		
		try
		{
		int num =  sc.nextInt();
		int division = num / 0;
		System.out.println(division);
		}
		catch (ArithmeticException e) {
		System.err.println("Divisable by zero not possible");
		}
		catch (InputMismatchException e) {
		System.err.println("Input must be integer");
		}
		finally {
			sc.close();
		}
		
		System.out.println("Completed");

	}

}
