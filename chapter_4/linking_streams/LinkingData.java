package linking_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LinkingData {
	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> st = cats.stream();
		cats.add("Hello");
		System.out.println(st.count());  // 3
	}
}
