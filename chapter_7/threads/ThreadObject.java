package threads;

public class ThreadObject extends Thread {
	
	@Override
	public void run() {
		System.out.println("Printing inventory");
	}
	
	public static void main(String[] args) {
		new ThreadObject().start();
	}
}
