package questions;

import java.util.Arrays;
import java.util.List;

public class OffRecordQuestion {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7); 
//		List<Integer> ls = Arrays.asList(1,2,3,4,5);
//		System.out.println(ls.stream().max((a, b)->a>b?a:b));
		System.out.println(ls.stream().max(Integer::max).get());
//		System.out.println(ls.stream().max(Integer::compare).get());
//		System.out.println(ls.stream().reduce(1, (a, b)-> a + b));
//		System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b));
		
	}

}
