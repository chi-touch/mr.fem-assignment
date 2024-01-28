
import java.util.Scanner;
public class TwoNumbers{


	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number:");
	int secondNumber = input.nextInt();

	int firstProduct = firstNumber  + firstNumber + firstNumber;
	int secondProduct = secondNumber + secondNumber + secondNumber;

	int product = firstProduct +secondProduct;

	System.out.printf("The product of the firstNumber is: %d%n",product);
	








}


}