
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mike
 */
public class A3Q7 {

    /**
     * take in an array and sort is
     *
     * @param nums the unsorted array
     * @return the array that is now sorted
     */
    public int[] countingSort(int[] nums) {

        // create a tracker array
        int[] tracker = new int[101];

        // go through the nums array
        for (int i = 0; i < nums.length; i++) {
            // store the spot value in a variable
            int a = nums[i];
            // add a one in the corresponding spot in the tracker array
            tracker[a]++;
        }

        // create a temporary variable
        int n = 0;
        // go through the array
        for (int i = 0; n < nums.length; i++) {
            // while the tracker arrays value is less than 0
            while (tracker[i] > 0) {
                // the value of the temp spot is the tracker actual spot
                nums[n] = i;
                // move to the next temp position
                n++;
                // take one away from the tracker value
                tracker[i]--;
            }
        }
        // return the sorted nums array
        return nums;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        A3Q7 test = new A3Q7();

        // create the array
        int nums[] = new int[10];

        // insert random numbers (from 0 - 101) into the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
        }

        // activate the counting method
        test.countingSort(nums);

        // print out the sorted nums array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
