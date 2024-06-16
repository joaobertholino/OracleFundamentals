package vehicles;

public class Vehicle {
	public static String make = "Augur";
	public static int numVehicles = 0;
	private String chassisNo;
	private String model;

	public Vehicle(String model) {
		numVehicles++;
		this.chassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}

	public static class Engine extends Vehicle{
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}

		public static String GET_MAKE() {
			return MAKE;
		}

		public static int GET_CAPACITY() {
			return CAPACITY;
		}
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		Vehicle.make = make;
	}

	public void setNumVehicles(int numVehicles) {
		Vehicle.numVehicles = numVehicles;
	}

	@Override
	public String toString() {
		return "Vehicle [chassisNo = " + chassisNo + ", model = " + model + ", Maker = " + Engine.GET_MAKE()
				+ ", Capacity: " + Engine.GET_CAPACITY() + "]";
	}
}
