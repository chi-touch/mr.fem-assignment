import java.util.Scanner;
public class Multiplication{
	
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number from 1 - 12:");
	int multi = input.nextInt();

	int count = 1;

	if(multi < 1 || multi > 12){
		System.out.print("invalid input");
	}else{
		while(count <=12){
		int results = multi * count;
		System.out.printf("%d * %d = %d%n", multi,count, results);
	count =count +1;

}


}

}

}