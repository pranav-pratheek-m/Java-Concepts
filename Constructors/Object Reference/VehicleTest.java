
class Vehicle {
    int generalBrandNo;

    Vehicle() {
        System.out.println("This is a vehicle");
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler() {
        System.out.println("This is a two wheeler");
    }
}

class Scooty extends TwoWheeler {
    int generalBrandNo = 233;

    Scooty() {
        System.out.println("This is a scooty");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle scooty = new Scooty();
        Vehicle vehicle = new Vehicle();
        scooty.generalBrandNo = 444;
        vehicle.generalBrandNo = 222;

        System.out.println("vehicle generalBrandNo: " + vehicle.generalBrandNo);
        System.out.println("scooty generalBrandNo: " + scooty.generalBrandNo);
    }

}
