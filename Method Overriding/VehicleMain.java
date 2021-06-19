import java.lang.*;

class Vehicle{
	public void getName(){
		System.out.println("This is just a template!! ");
	}
	
	public void getNoOfWheels(){
		System.out.println("A template has no wheels.. \n");
	}
	
	static final String GOLD = "Gold";
}

class Bike extends Vehicle{
	public void getName(){
		System.out.println("This is a bike ");
	}
	
	public void getNoOfWheels(){
		System.out.println("A bike has 2 wheels \n");
	}	
	
	public void getPassengers(){
		System.out.println("This is only for 2 people.");
	}
	
	static final String GOLD = "Necklace";
}


class Car extends Vehicle{
	public void getName(){
		System.out.println("This is a car ");
	}
	
	@Override
	public void getNoOfWheels(int x){
		System.out.println("A car has 4 wheels \n");
	}	
}

class Truck extends Vehicle{
	public void getName(){
		System.out.println("This is a truck ");
	}
	
	public void getNoOfWheels(){
		System.out.println("A truck has 8 wheels \n");
	}	
}

public class VehicleMain {
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle();
		Vehicle bike = new Bike();
		//Bike bike = new Bike();
		
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		
		bike = car;
		//bike = null;
		System.out.println(bike.GOLD);
		System.out.println(Vehicle.GOLD);
		Bike bike2 = null;
		System.out.println(bike2.GOLD);
		vehicle.getName();
		vehicle.getNoOfWheels();
		
		bike.getName();
		bike.getNoOfWheels();
		//bike.getPassengers();
		
		car.getName();
		car.getNoOfWheels();
		
		truck.getName();
		truck.getNoOfWheels();
		
		
	}
}