package functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<LocalDate> d1 = LocalDate::now;
		Supplier<LocalDate> d2 = () -> LocalDate.now();
		
		System.out.println(d1.get());
		System.out.println(d2.get());
		
		Supplier<ArrayList<String>> a1 = ArrayList<String>::new;
		Supplier<ArrayList<String>> a2 = () -> new ArrayList<String>();
		ArrayList<String> ar1 = a1.get();
		
		System.out.println(ar1);
	}
}
