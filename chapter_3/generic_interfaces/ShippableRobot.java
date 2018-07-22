package generic_interfaces;

import java.util.*;

//public class ShippableRobot implements Shippable<Robot> {
//	public void ship(Robot r) {
//		
//	}
//}

public class ShippableRobot<U> implements Shippable<U> {
	
	public List<U> array = new ArrayList<>();
	
	public void ship(U r) {
		
	}
}
