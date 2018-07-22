package nested_classes;

public class AnonInner {
//	abstract class SaleTodayOnly {
//		abstract int dollarsOff();
//	}
	
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int pay() {
		return adm(5, new SaleTodayOnly() {
			public int dollarsOff() { return 3; }
		});
	}
	
	public int adm(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() {
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
}
