package factory_pattern;

public class ZooKeeper {

	public static void main(String[] args) {
		Food f = FoodFactory.getFood("polar bear");
		f.consumed();
	}

}
