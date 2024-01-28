import java.util.Scanner;
public class MultiplicationTable{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int count = 1;
	int multiply = 0;
	System.out.print("Enter a number:");
	int number = input.nextInt();

	for(int i = 1; i <= 12; i++){
		multiply = number * i;
		
	System.out.println(number+" * "+ i+ " = "+ multiply);

	




}





}

}