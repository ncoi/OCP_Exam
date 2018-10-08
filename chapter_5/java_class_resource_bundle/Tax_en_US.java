package java_class_resource_bundle;

import java.util.ListResourceBundle;

public class Tax_en_US extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"tax", new TaxCode("US")}
		};
	}
	
}
