package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Sri");
        myList.add("Samyu");
        myList.add("Ravi");
        myList.add("Shaarvi");
        myList.add("Abhi");

        for(String name:myList){
            System.out.println(name);
        }

        System.out.println("3rd Element: "+ myList.get(2));
        System.out.println("Check for Element Ravi: " + myList.contains("Ravi"));
        System.out.println("Size of List:" + myList.size());
        myList.remove("Sri");
        System.out.println("Size of List after removing element:" + myList.size());
    }


}
