package array;

public class Arrayaddition {
	public static void main(String[] args) {
		int delete_ele = 60;
		int pos=3;
        int insert_ele = 100;
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("Array is given as");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			if (delete_ele == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
		}
	}
		System.out.print(" array after delete element" + "  ");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		for(int i=a.length -1;i>pos-1 ;i--) {
			a[i] = a[i-1];
		}
		a[pos] = insert_ele;
		System.out.println("Array after insert element");
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		
			}
		}
		
}
