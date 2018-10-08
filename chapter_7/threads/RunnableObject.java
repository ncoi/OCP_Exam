package threads;

public class RunnableObject implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 3; i++)
			System.out.println("Printing record: " + i);
	}
	
	public static void main(String[] args) {
		new Thread(new RunnableObject()).start();
	}

}
