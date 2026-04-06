package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {

	
	@Override
	public Vehicle createVehicle(String type, String engineType) {
		Vehicle vehicle = null;
		if (type.equalsIgnoreCase("car") && engineType.equalsIgnoreCase("electric"))
			vehicle = new Car(new ElectricEngine(), 4);
		else if (type.equalsIgnoreCase("truck") && engineType.equalsIgnoreCase("Diesel"))
			vehicle = new Truck(new DieselEngine(), 55);
		else if (type.equalsIgnoreCase("motorcycle") && engineType.equalsIgnoreCase("electric"))
			vehicle = new Motorcycle(new ElectricEngine(), false);
		else throw new IllegalArgumentException("Invalid Type");
		return vehicle;

	}

}
