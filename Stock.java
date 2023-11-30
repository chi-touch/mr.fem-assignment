import java.util.Scanner;
public class Stock{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("enter an item:");
	String name = scanner.next();

	System.out.print("enter price for item:");
	int price = scanner.next();

	int discount = 0.1;
	int itemAmount = price * discount;

	System.out.print("itemAmount is:" + itemAmount);

	


	


}



}