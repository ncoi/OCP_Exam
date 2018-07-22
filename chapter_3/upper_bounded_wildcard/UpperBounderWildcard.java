package upper_bounded_wildcard;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class UpperBounderWildcard {
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number number : list) {
			count += number.longValue();
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(total(list));
	}
}
