package isntanceof;

import static nested_classes.StaticClass.StaticNested;

public class Hippo extends HeavyAnimal {
	public static void main(String [] args) {
		HeavyAnimal hippo = new Hippo();
		MotherHippo mh = new MotherHippo();
		Hippo h = mh;
		Mother m = mh;
		MotherHippo mh2 = (MotherHippo) m;
		boolean b = mh2 instanceof Mother;
		System.out.println(b);
	}
}
