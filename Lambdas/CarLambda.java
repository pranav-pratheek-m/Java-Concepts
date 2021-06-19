import java.util.*;
import java.util.function.Predicate;

class Car{
    private String name;
    private int price;
    private int mileage;
    private int distance_covered;

    Car(String name,int price,int mileage,int distance_covered){
     this.name = name;
     this.price = price;
     this.mileage = mileage;
     this.distance_covered = distance_covered;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMileage(){
        return this.mileage;
    }

    public int getDistanceCovered(){
        return this.distance_covered;
    }

    @Override
    public String toString(){
        return "\n" + this.name;
    }

    static ArrayList<Car> carQuery(ArrayList<Car> carList,Predicate<Car> expression){
        ArrayList<Car> result = new ArrayList<Car>();

        for(Car car : carList){
            if(expression.test(car)){
                result.add(car);
            }
        }
        return result;
    }
}

public class CarLambda{
    public static void main(String[] args){
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Hyundai Santro",4,21,2000));
        carList.add(new Car("Hyundai Creta",9,14,200));
        carList.add(new Car("Honda City",14,13,1200));
        carList.add(new Car("Suzuki Swift",8,22,400));
        carList.add(new Car("Suzuki Alto",4,21,600));
        carList.add(new Car("Ford Figo",14,12,1400));
        carList.add(new Car("Hyundai Venue",24,10,900));

        System.out.println("All cars: " + carList);

        System.out.println("\nAfter Filtering\n");
        System.out.println("\nCars with price greater than 10 Lakhs \n" + Car.carQuery(carList,car -> car.getPrice() > 10));
        System.out.println("\nCars which have travelled less than 1000km \n" + Car.carQuery(carList,car -> car.getDistanceCovered() < 1000));
        System.out.println("\nCars with mileage between 10 and 20 \n" + Car.carQuery(carList,car -> {
                                                                                                     int mileage = car.getMileage();
                                                                                                     return (mileage >= 10 & mileage <= 20);}));

        System.out.println("\nCars of Hyundai Brand  " + Car.carQuery(carList,car -> car.getName().contains("Hyundai")));                                                                                             
    }
}