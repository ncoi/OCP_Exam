package java_class_resource_bundle;

public class TaxCode {
	private String tax;
	public TaxCode(String country) {
		if(country == "US") {
			tax = "American Tax Code";
		} else {
			tax = "French Tax Code";
		}
	}
	
	@Override
	public String toString() {
		return tax;
	}
}
