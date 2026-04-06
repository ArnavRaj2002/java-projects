package nit.sbeans;

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		 System.out.println("Electric Engine started");

	}

	@Override
	public void stop() {
		 System.out.println("Electric Engine stopped");
	}

}
