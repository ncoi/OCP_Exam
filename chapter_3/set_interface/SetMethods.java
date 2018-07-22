package set_interface;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);  // true
		set.add(2);  // true
		set.add(3);  // true
		set.add(1);  // false
		set.add(5);  // true
		
		for(Integer i : set) System.out.println(i + ", ");
	
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);  // true
		treeSet.add(2);  // true
		treeSet.add(3);  // true
		treeSet.add(1);  // false
		treeSet.add(5);  // true
		
		for(Integer i : treeSet) System.out.println(i + ", ");
		
		
		NavigableSet<Integer> nset = new TreeSet<>();
		for(int i = 1; i <= 20; i++ ) nset.add(i);
		System.out.println("Lower: " + nset.lower(10));
		System.out.println("Floor: " + nset.floor(10));
		System.out.println("Ceiling: " + nset.ceiling(20));
		System.out.println("Higher: " + nset.higher(20));
	}
}
