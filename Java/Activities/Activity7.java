package activities;

interface BicycleParts{
    int gears = 0;
    int currentSpeed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    public void applyBrake(int decrement){
        this.currentSpeed -= decrement;
        System.out.println("Current Speed after brakes: " + this.currentSpeed);
    }
    public void speedUp(int increment){
        this.currentSpeed += increment;
        System.out.println("Current Speed after speeding: " + this.currentSpeed);
    }
    public String bicycleDesc(){
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int currentSpeed, int Height) {
        super(gears, currentSpeed);
        seatHeight = Height;
    }
        public void setHeight(int value){
            seatHeight = value;
        }
        public String bicycleDesc() {
            return (super.bicycleDesc()+ "\nSeat Height: " + seatHeight);
    }
}

public class Activity7 {
    public static void main(String[] args) {
        MountainBike myBike = new MountainBike(3, 0, 25);
        System.out.println(myBike.bicycleDesc());
        myBike.speedUp(20);
        myBike.applyBrake(5);
    }
}

