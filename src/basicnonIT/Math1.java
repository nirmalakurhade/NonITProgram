package basicnonIT;

import java.util.Scanner;

public class Math1 {
	private static char[] a;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any number ");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
	    int a=n*(i-1);
		System.out.println(a);
		}
}
}