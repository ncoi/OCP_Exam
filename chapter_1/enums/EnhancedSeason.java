package enums;

enum EnhancedSeason {
	WINTER("Low") {
		public void printExpectedVisitors() {
			System.out.println("Override");
		}
	}, SPRING("Medium"), SUMMER("High"), FALL("Medium");
	private String expectedVisitors;
	private EnhancedSeason(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
