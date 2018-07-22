package object_composition;

public class Penguin {
	private final Flippers flippers;
	private final WebbedFeet feet;
	
	public Penguin() {
		this.flippers = new Flippers();
		this.feet = new WebbedFeet();
	}
	
	public void flap() {
		flippers.flap();
	}
	
	public void kick() {
		feet.kick();
	}

	public static void main(String[] args) {
		Penguin p = new Penguin();
		p.flap();
		p.kick();
	}

}
