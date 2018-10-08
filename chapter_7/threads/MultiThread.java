package threads;

public class MultiThread {
	public static void main(String[] args) {
		System.out.println("start");
//		new Thread(new RunnableObject()).start();
//		new ThreadObject().start();
//		new Thread(new RunnableObject()).start();
		
		new Thread(new RunnableObject()).run();
		new ThreadObject().run();
		new Thread(new RunnableObject()).run();
		System.out.println("end");
	}
}
