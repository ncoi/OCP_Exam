package set_interface;

import java.util.*;

public class SetTesting {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Monday");
		set.add("Tuesday");
		set.add("Wednesday");
		set.add("Thursday");
		set.add("Friday");
		set.add("Saturday");
        set.add("Sunday");
		System.out.println(set);
	}
}
