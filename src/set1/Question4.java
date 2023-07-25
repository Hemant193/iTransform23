package set1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Marks of Sub-1: ");

		int sub1 = sc.nextInt();

		System.out.print("Enter Marks of Sub-1: ");

		int sub2 = sc.nextInt();

		System.out.print("Enter Marks of Sub-1: ");

		int sub3 = sc.nextInt();

		if (sub1 > 60 && sub2 > 60 && sub3 > 60) {

			System.out.print("Pass");

			System.exit(0);

		} else if ((sub1 > 60 && sub2 > 60) || (sub2 > 60 && sub3 > 60) || (sub1 > 60 && sub3 > 60)) {

			System.out.println("Promoted");

			System.exit(0);

		} else {

			System.out.println("Failed");

		}

	}

}
