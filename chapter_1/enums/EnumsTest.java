package enums;

public class EnumsTest {
	public static void main(String []args) {
		Season s = Season.WINTER;
		System.out.println(Season.WINTER);
		System.out.println(s == Season.WINTER);
		
		System.out.println("Enum.values(): " + Season.values());
		
		for(Season se: Season.values()) {
			System.out.println("Enum: " + se.name() + " Position: " + se.ordinal());
		}
		
		
	}
}
