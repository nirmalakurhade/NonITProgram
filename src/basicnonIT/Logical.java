package basicnonIT;

import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int i = sc.nextInt();
		if (i%2==0) {
			System.out.println("Prime no.");
		}else {
			System.out.println("No prime number.");
		}
	}

}
