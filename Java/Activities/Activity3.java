package activities;

public class Activity3 {
    public static void main(String[] args) {

        double seconds = 100000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("Earth Year: " + seconds/EarthSeconds);
        System.out.println("Mercury Year: " + seconds/EarthSeconds/MercurySeconds);
        System.out.println("Venus Year: " + seconds/EarthSeconds/VenusSeconds);
        System.out.println("Mars Year: " + seconds/EarthSeconds/MarsSeconds);
        System.out.println("Jupiter Year: " + seconds/EarthSeconds/JupiterSeconds);
        System.out.println("Saturn Year: " + seconds/EarthSeconds/SaturnSeconds);
        System.out.println("Uranus Year: " + seconds/EarthSeconds/UranusSeconds);
        System.out.println("Neptune Year: " + seconds/EarthSeconds/NeptuneSeconds);
    }
}
