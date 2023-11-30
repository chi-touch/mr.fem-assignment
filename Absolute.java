import java.util.Scanner;
public class Absolute{

	public static void main(String[]args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("enter any number");
	int numb = userInput.nextInt();

	int absoluteValue = (numb)-0;
	if(numb < -1){
	absoluteValue =(-1 * absoluteValue);
}
 	
	System.out.println("absoluteValue is:" + absoluteValue);

}




}