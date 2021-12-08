package basicnonIT;

import java.util.Scanner;

public class Seies {
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   System.out.println("enter no");
   int i = sc.nextInt();
   int n = 0 ;
   for(int i1=i; i1<=20; i1++) {
	   if(i1%2==0) {
		   System.out.println(i1);
	   }
	   
   }
	}

}
