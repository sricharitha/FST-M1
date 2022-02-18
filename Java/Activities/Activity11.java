package activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Blue");
        colors.put(2, "Red");
        colors.put(3, "Green");
        colors.put(4, "White");
        colors.put(5, "Black");

        System.out.println("Colors: " + colors);
        colors.remove(5);
        if(colors.containsValue("Green")){
            System.out.println("Colors contains Green");
        }else {
            System.out.println("Colors does not contain Green");
        }
        System.out.println("Size: " + colors.size());


    }
}
