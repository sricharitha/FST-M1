package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] nums = {8, 10, 2, 4, 1, 9, 6, 5, 7};
        System.out.println("Unsorted Array: " + Arrays.toString(nums));
        arraySort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
    public static void arraySort(int n[]) {
        int len = n.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
}
