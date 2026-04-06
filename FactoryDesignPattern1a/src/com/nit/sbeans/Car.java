package com.nit.sbeans;

//using Factory Pattern, you don’t need Spring to auto-create these beans.
//They are created by your ConcreteVehicleFactory
//@Component
public class Car implements Vehicle {
	private Engine engine;
	private int numberOfDoors;

	// public Car(@Qualifier("diesel") Engine engine, int numberOfDoors) {
	 public Car(Engine engine, int numberOfDoors) {
		super();
		this.engine = engine;
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String getDescription() {

		return "Car [engine=" + engine.getEngineType() + ", numberOfDoors=" + numberOfDoors + "]";
	}

}
