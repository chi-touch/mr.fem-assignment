import java.security.SecureRandom;
import java.util.Scanner;
public class Random{

	public static void main(String[]args){

	SecureRandom more = new SecureRandom();
	int randomInt =  more.nextInt(1, 11);
	

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter number:");
	int number = scanner.nextInt();
	
	
	 if (number < 0 || number > 0 ){
	 System.out.println("Enter number: ");
	 number = scanner.nextInt();
         if (number > 0 && number <= 10){
	 if (number > randomInt){
	   System.out.printf("Too high: Random number = %d%nYour guess = %d", randomInt, number);
	 }
	 else if (number < randomInt){
	   System.out.printf("Too low: Random number = %d%nYour guess = %d", randomInt, number);
	 }
	 else{
	   System.out.printf("Correct: Random number = %d%nYour guess = %d", randomInt, number);
	   }
	  }
	 }
        }



}