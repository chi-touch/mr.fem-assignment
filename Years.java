import java.util.Scanner;
public class Years{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);



	

	System.out.print("Enter your year of birth:");
	int yearOfBirth = input.nextInt();

	System.out.print("Enter the current year:");
	int currentYear = input.nextInt();
	
	int currentAge = currentYear - yearOfBirth;

	System.out.printf("you are %d years old",currentAge);






}


}