package concurrent_collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,4,3));
		for(Integer item : list) {
			System.out.print(item+" ");
			list.add(9);
		}
		System.out.println();
		System.out.println("Size: " + list.size());
	}

}
