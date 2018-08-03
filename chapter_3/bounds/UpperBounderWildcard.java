package bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBounderWildcard {
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number n : list) {
			count += n.longValue();
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>();
//		list.add(new Integer(5));
	}
}
