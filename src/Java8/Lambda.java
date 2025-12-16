package Java8;
import java.util.*;
public class Lambda{
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5);
		
		li.forEach(n->System.out.println(n));
		
	}
}