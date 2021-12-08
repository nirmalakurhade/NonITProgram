package array;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any String");
		String s = sc.next();
		char[] ch = new char[s.length()];
		ch = s.toCharArray();
		System.out.println("String after reverse");
		for (int i = (s.length()-1); i >=0; i--) {
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
