package java_class_resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_fr extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] {
			{"hello", "Bonjour"},
			{"open", "Le zoo est ouvert"}
		};
	}
}
