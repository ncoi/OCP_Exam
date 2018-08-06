package unary_operator;

import java.util.Arrays;
import java.util.List;

public class UnaryOperator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		list.replaceAll(x -> x*2);
		System.out.println(list);
	}
}
