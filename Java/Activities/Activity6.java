package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassangers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }
    public Date takeOff(){
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land(){
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassesngers(){
        return passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane myplane = new Plane(10);
        myplane.onboard("Elly");
        myplane.onboard("Mochi");
        myplane.onboard("Tom");
        myplane.onboard("John");

        System.out.println("Took Off time: " + myplane.takeOff());
        System.out.println("Passengers: " + myplane.getPassesngers());
        Thread.sleep(5000);
        myplane.land();
        System.out.println("Landed at: " + myplane.getLastTimeLanded());
    }
}
