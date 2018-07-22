package nested_classes;

public class AnonInnerComplex {
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	
	public int pay() {
		return admission(5, new SaleTodayOnly() {
			int dollarsOff() { return 3; }
		});
	}
	
	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String [] args) {
		AnonInnerComplex aic = new AnonInnerComplex();
		System.out.println(aic.pay());
	}
}
