import java.util.Scanner;
public class PositiveNumber{


	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number between 1 and 20 to get the factorial:");
	int number = input.nextInt();

	int counter =1;
	int factorial = 1;
	//counter = number;

	while(number >= counter){
		factorial *= counter;
		counter++;

	}

	System.out.printf("%d is the factorial of %d", number, factorial);
	}


}