import java.util.*;
public class DescendingArray{

	public static void main(String[]args){

		Integer[] array ={1,2,3,4,5,6,7,8};

//Arrays.sort(array); this is ascending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.printf("%s", 		Arrays.toString(array));


	}
}