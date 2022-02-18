package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] numArray = {10, 77, 10, 54, 10, -11, 10};
        int sum = 0;
        for (int i: numArray) {
            if (i % 10 == 0) {
                sum += i;
            }
        }
    System.out.println("Sum of 10s: " + sum);

    }
}
