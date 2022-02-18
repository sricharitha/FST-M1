package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Pineapple");
        hs.add("Grapes");
        hs.add("Banana");
        hs.add("Kiwi");

        System.out.println("Size: " + hs.size());
        hs.remove("Banana");
        hs.remove("Pears");
        System.out.println("Check for the Element Mango:" + hs.contains("Mango"));
        System.out.println("Hash Set:" + hs);
    }
}
