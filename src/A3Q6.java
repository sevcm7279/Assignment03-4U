
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A3Q6 {

    /**
     * sort the array from highest to lowest
     * @param n is the array
     */
    public void insertionSort(int[] n) {
        // go through the array
        for (int i = 1; i < n.length; i++) {
            // set variable j as the position in the array
            int j = i;
            // while the position before is less than j, 
            while (j > 0 && n[j - 1] < n[j]) {
                // switch the numbers
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        A3Q6 test = new A3Q6();

        // create a scanner
        Scanner input = new Scanner(System.in);

        // ask the user how many numbers are in the array
        System.out.println("How many numbers do you want to sort?");
        // store the number of numbers in a variable
        int n = input.nextInt();

        // create an array
        int[] nums = new int[n];

        // create a loop to enter the numbers
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter a number");
            nums[i] = input.nextInt();
        }

        // activate the sorting method
        test.insertionSort(nums);

        // print out the sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);


        }
    }
}
