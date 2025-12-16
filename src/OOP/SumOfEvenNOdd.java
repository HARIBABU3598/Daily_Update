package OOP;

import java.util.*;

public class SumOfEvenNOdd {
	
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(23,24,22,28,27,29,30,49);
		int evenSum=0;
		int oddSum=0;
		for(int n:al) {
			if(n%2==0) {
				evenSum+=n;
			}
			else {
				oddSum+=n;
			}
		}
		System.out.println("Sum of the Even numbers: "+evenSum);
		System.out.print("Sum of the odd numbers: "+oddSum);
	}

}
