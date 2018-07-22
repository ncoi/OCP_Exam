package nested_classes;

public class PrivateInterface {
	private interface Secret {
		public void shh();
	}
	
	class DontTell implements Secret {

		@Override
		public void shh() {
			
		}
		
	}

	public static void main(String[] args) {
		

	}

}
