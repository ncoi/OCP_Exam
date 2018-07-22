package concurrent_classes;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,32));
		for(Integer item: list) {
			System.out.println(item+" ");
			list.add(9);
		}
		
		System.out.println();
		System.out.println("Size: "+list.size());
	}

}
