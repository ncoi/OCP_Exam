package arrays_arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchAndSort {
	public static void main(String[] args) {
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers);
		// array must be sorted, if not results are undefined
		// index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1) 
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		
		
		List<Integer> list = Arrays.asList(9,7,5,3);
		Collections.sort(list);
		// array must be sorted, if not results are undefined
		// index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
		System.out.println(Collections.binarySearch(list, 3));  // 0
		System.out.println(Collections.binarySearch(list, 2));  // -1
	}
}
