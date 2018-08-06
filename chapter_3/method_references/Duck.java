package method_references;

public class Duck {
	private int weight;
	private String name;
	
	public Duck(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
}
