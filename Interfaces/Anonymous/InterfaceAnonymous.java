interface Machineable {
    String getMachineName();
}

interface Sportable {
    String getSportName();
}

public class InterfaceAnonymous {
    public static void main(String[] args) {
        Machineable car = new Machineable() {
            public String getMachineName() {
                return "Car is a 4 wheeled machine..";
            }
        };

        Sportable soccer = new Sportable() {
            public String getSportName() {
                return "Soccer is the most popular sport..";
            }
        };

        System.out.println(car.getMachineName());
        System.out.println(soccer.getSportName());

    }
}