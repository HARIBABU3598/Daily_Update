package OOP;

import java.util.Arrays;
import java.util.*;

public class EvenNOdd {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,3,2,5,4,6,7,9,6,4,5);
		
		for(int n:li) {
			if(n%2==0) {
				System.out.println("Even: "+n);
			}
			else {
				System.out.println("Odd : "+n);
			}
		}
	}
}
