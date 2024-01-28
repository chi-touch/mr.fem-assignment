import java.util.*;

public class ReverseNumber{

	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int[]number = new int[5];

	System.out.print("Enter a number:");

	int digit = input.nextInt();

	
	int value = digit / 10000;
	int value1 = digit /1000 % 10;
	int value2 = digit /100 % 10;
	int value3 = digit /10 % 10;
	int value4 = digit %10 % 10;
	
	

	System.out.print(value4);
	System.out.print(value3);
	System.out.print(value2);
	System.out.print(value1);
	System.out.print(value);
	
	
	
	


}

}