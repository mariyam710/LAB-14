import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	static Scanner inp = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("====hello kids! welcome to division game======");
		
		try {
			System.out.println("Enter first digit:  ");
			num1 = inp.nextInt();
			System.out.println("Enter second digit:  ");
			num2 = inp.nextInt();
			if(num2==0) {
				throw new ArithmeticException("\nZero should not be entered. ");
			}
			System.out.println("Answer is :" + num1/num2);
		}
		catch (InputMismatchException e) {
			System.out.println("Only whole numbers  be eneterd. ");
		}
			
		}
}
		
		
	
		
				
			
		
	
	
	


