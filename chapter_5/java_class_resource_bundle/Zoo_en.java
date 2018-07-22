package java_class_resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] {
			{"hello", "Hello"},
			{"open", "The zoo is open"}
		};
	}
}
