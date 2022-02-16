
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting Camera");			
	}

	@Override
	public void doStuff() {
		System.out.println("Do something");
		
	}

	@Override
	public void shutDown() {
		
		System.out.println("Shut down ");
		
	}

}
