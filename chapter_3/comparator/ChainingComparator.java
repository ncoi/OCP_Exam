package comparator;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {

	@Override
	public int compare(Squirrel s1, Squirrel s2) {
//		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
//		c = c.thenComparingInt(s -> s.getWeight());
		
		Comparator<Squirrel> s = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);
		return s.compare(s1, s2);
	}
	
}
