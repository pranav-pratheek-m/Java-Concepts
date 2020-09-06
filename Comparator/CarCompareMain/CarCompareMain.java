import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car{
	String name;
	int price;
	int mileage;
	
	Car(String name,int price,int mileage){
		this.name = name;
		this.price = price;
		this.mileage = mileage;
	}
}

class PriceCompare implements Comparator<Car>{
	@Override
	public int compare(Car car1,Car car2){
		if(car1.price == car2.price ){
			return 0;
			//car1.name.compareTo(car2.name);
		}else if(car1.price > car2.price){
			return 1;
		}else{
			return -1;
		}
	}
}

class NameCompare implements Comparator<Car>{
	
	@Override
	public int compare(Car car1,Car car2){
		return car1.name.compareTo(car2.name);
	}
}

class MileageCompare implements Comparator<Car>{
	
	@Override
	public int compare(Car car1,Car car2){
		/*if(car1.mileage == car2.mileage){
			return 0;
		}else if(car1.mileage > car2.mileage){
			return 1;
		}else{
			return -1;
		}*/
	  //return car2.mileage - car1.mileage; //for descending
	  return car1.mileage - car2.mileage; //for ascending
	}
}

public class CarCompareMain {
	public static void main(String[] args){
		Car car1 = new Car("Hyundai Santro",4,28);
		Car car2 = new Car("Suzuki Swift",8,18);
		Car car3 = new Car("Suzuki 800",3,34);
		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		Collections.sort(carList,new PriceCompare());
		
		System.out.println("Cars sorted acc. to price");
		for(Car car : carList){
			System.out.println("Name: "+ car.name + "\t Price: " + car.price + "\t Mileage: " + car.mileage);
		}

        Collections.sort(carList,new NameCompare());
		
		System.out.println("\n\nCars sorted acc. to name");
		for(Car car : carList){
			System.out.println("Name: "+ car.name + "\t Price: " + car.price + "\t Mileage: " + car.mileage);
		}

        Collections.sort(carList,new MileageCompare());
		
		System.out.println("\n\nCars sorted acc. to mileage");
		for(Car car : carList){
			System.out.println("Name: "+ car.name + "\t Price: " + car.price + "\t Mileage: " + car.mileage);
		}		
	}
}