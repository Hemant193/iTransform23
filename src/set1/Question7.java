package set1;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {

		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched");
		
		int num = sc.nextInt();
		
		for(int n: arr) {
			if(n == num) {
				System.out.println("number found");
				System.exit(0);;
			}
		}
		System.out.println("number not found");
	}

}
