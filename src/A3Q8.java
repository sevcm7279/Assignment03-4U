/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
public class A3Q8 {

    public void alphaInsertionSort(String[] w){
        // go through the array of words
        for (int i = 0; i < w.length; i++) {
            // set j as the current position
            int j = i;
            // while the previous word starts with a letter after the current word, switch
            while(j > 0 && w[j - 1].compareToIgnoreCase(w[j]) > 0){
                // create a temporary place for the current word
                String temp = w[j];
                // then switch the words
                w[j] = w[j - 1];
                w[j - 1] = temp;
                j--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A3Q8 test = new A3Q8();
        
        // create a string array
        String[] words = {"Homer", "marge", "duff", "Lisa", "bart", "maggie"};
        
        // activate the mathod to sort alphabetically
        test.alphaInsertionSort(words);
        
        // print out the words
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
    
}
