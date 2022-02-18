package activities;

@FunctionalInterface
interface Addable{
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 3;
        Addable ad1 = (n1, n2) -> n1 + n2;
        Addable ad2 = (n2, n3) -> {
            return n2 + n3;
        };
        int sum1 = ad1.add(num1, num2);
        int sum2 = ad2.add(num2, num3);
        System.out.println("Sum of num1, num2= " + sum1);
        System.out.println("Sum of num2, num3= " + sum2);
    }
}
