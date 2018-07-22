package nested_classes;

public class AnonInnerClass {
	private int price = 15;
	
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	
	public int admission(int basePrice) {
		/* must extend a class or implement and interface */
		SaleTodayOnly sto = new SaleTodayOnly() {
			int dollarsOff() {
				return 3;
			}
		};
		return basePrice - sto.dollarsOff();
	}
	
	public static void main(String [] args) {
		AnonInnerClass aic = new AnonInnerClass();
		System.out.println(aic.admission(10));
	}
}
