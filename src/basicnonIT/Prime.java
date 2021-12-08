package basicnonIT;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter any number ");
	int n=sc.nextInt();
	int count=0;
	for(int i=2;i<=n-1;i++) {
		if(n%i==0) {
			count++;
			break;
		}
	}
	if(count==0) {
		System.out.println("prime no");
	}else {
		System.out.println("Non prime no");
	}
}
}
