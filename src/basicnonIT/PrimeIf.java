package basicnonIT;

public class PrimeIf {
public static void main(String[] args) {
	int n=5;
	int a=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			a++;
			break;
		}
	}
	if(a==1) {
		System.out.println("not prime");
	}
	else {
		System.out.println("number is prime");
	}
}
}
