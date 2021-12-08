package array;

import java.util.Scanner;

public class ArrayRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Row element");
		int row = sc.nextInt();
		System.out.println("Enter length of Column element");
		int column = sc.nextInt();
		int a[][]= new int[row][column];//declare
		System.out.println(" Enter row " + row + " Enter column " + column);
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Element in array");
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) {
				System.out.println("Array elements" +a[i][j]);
	}
			System.out.println();
	
	}
	}
  

}
