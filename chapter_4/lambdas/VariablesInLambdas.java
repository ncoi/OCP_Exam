package lambdas;

interface Gorilla { String move(); }
public class VariablesInLambdas {
	String walk = "walk";  // instance variable
	static String walking = "walking"; // static variable
	void everyonePlay(boolean baby) {
		String approach = "amble";  // effectively final local variable
		walk = "walk2";
		walking = "walking2";
//		 approach = "run";
		
		play(() -> walk); // instance variable
		play(() -> baby ? "hitch a ride" : "run"); // effectively final method parameter
		play(() -> approach);
		play(() -> walking);
	} 
	
	void play(Gorilla b) {
		System.out.println(b.move());
	}
	
	public static void main(String[] args) {
		VariablesInLambdas v = new VariablesInLambdas();
		v.everyonePlay(true);
	}
}
