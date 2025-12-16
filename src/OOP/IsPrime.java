package OOP;

public class IsPrime {
	public static void main(String[] args) {
		int n=23;
		boolean isTrue=true;
		if(n<=1) {
			System.out.println("Not a prime number");
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isTrue=false;
				}
				
			}
		}
		if(isTrue==true) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
