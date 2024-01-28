import java.util.Scanner;
public class SideBySide{


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int calculator =0;
	
	for(int i = 1; i <=12; i++){
		for(int j =1;j <=12; j++){

			calculator = i *j;

			System.out.print(j + " * " + i + " = " + calculator + "\t");

					
		}
			System.out.println();
	}

}








}



 