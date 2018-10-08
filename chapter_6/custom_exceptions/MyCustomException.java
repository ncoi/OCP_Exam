package custom_exceptions;

public class MyCustomException extends Exception {
	public MyCustomException() {
		super();
	}
	
	public MyCustomException(Exception e) {
		super(e);
	}
	
	public MyCustomException(String message) {
		super(message);
	}
}
