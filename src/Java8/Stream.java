package Java8;
import java.util.*;
public class Stream {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4);
		
		System.out.println("Print using filter() method :");
		li.stream()
		.filter(n->n%2==0)
		.forEach(n->System.out.println(n));
		
		System.out.println("Print using map() method :");
		li.stream()
		.map(n->n*2)
		.forEach(n->System.out.println(n));
		
		System.out.println("Print using reduce() method :");
		int sum=li.stream()
				.reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}
}
