package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        myCar.transmission = "Auto";
        myCar.make = 2018;

        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
    }
}
