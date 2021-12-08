package array;

public class ArraySort {
	public static void main(String[] args) {
		int a[] = {12,25,37,49,10,67,45,34};
		int temp;
		
		for(int i=0 ; i<a.length;i++) //round = no of element -1
		{
			int flag = 0;
			for(int j=0;j<a.length-1-i; j++) 
			{
				if(a[j]>a[j+1]) 
				{
					temp = a[j];
					a[j] = a [j+1];
					a[j+1] = temp;
					flag=1;
				}
				
			}
			if (flag==0) {
				break;
			}
		}
		for( int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}
	
}
