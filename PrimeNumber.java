import java.util.Scanner;
public class PrimeNumber{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int number = input.nextInt();

	int count = 0;

	for (int i = 1; i < number; i++){
	
		if(number % i==0){
			count++;
		}
	}

	if(count >1){
		System.out.print("Is a not prime number");
	}else{
		System.out.print("Is a prime number");
	}
	

	






	} 
	






}