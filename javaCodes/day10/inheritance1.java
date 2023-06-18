package javaCodes.day10;

class HelloWorld {
    public static void main(String[] args) {
        Vehicle auto = new Bus();
        System.out.println(auto.getDistanceToEpty(5, 15));
    }
}

abstract class Vehicle {
    int fuelTank = 10;
    int mileage = 20;

    int getDistanceToEpty(int mileage, int fuelTank) {
        System.out.println("Second");
        return fuelTank * mileage;
    }
}

class Bus extends Vehicle {
    int fuelTank = 10;
    int mileage = 20;

    int getDistanceToEpty(int mileage, int fuelTank) {
        System.out.println("Bus Second");
        return fuelTank * mileage;
    }
}
