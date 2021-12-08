package basicnonIT;

public class Pattern4 {
	
public static void main(String[] args) {
	

		int r = 6;
		for (char i = 'A'; i <= 'D'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println(" ");
		}
		System.out.println("------------");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		System.out.println("----------------------");
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("*");
		}
		System.out.println("-----------------");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("*");
		}
		for (int i = 6; i <= 1; i--) {
			for (int j = 12; j <=i; j--) {
				System.out.print(j);
			}
			System.out.println("*");
		}
	}


}