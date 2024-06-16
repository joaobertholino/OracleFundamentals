package driver;

import vehicles.Vehicle;

public class TestVehicle {
	public static void main(String[] args) {
		String make = Vehicle.make;
		System.out.println("Manufacturer: " + make);
		
		int numVehicles = Vehicle.numVehicles;
		System.out.println("Number of vehicles manufactured: " + numVehicles);
		
		Vehicle vehicle1 = new Vehicle("Model 3");
		System.out.println("Model of vehicle: " + vehicle1.getModel());
		System.out.println("Number of chassis: " + vehicle1.getChassisNo());
		
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println("Model of vehicle: " + vehicle2.getModel());
		System.out.println("Number of chassis: " + vehicle2.getChassisNo());
		
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		
		vehicle2.setMake("Seer");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a Fortune model and has an engine capacity of " + vehicle3.GET_CAPACITY() + "cc");
		
		System.out.println("Number of vehicles manufactured: " + numVehicles);
		
	}
}
