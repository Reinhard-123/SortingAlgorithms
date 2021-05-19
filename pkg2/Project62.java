
package project6.pkg2;

import java.util.Random;
import java.util.Scanner;


public class Project62 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];//makes array of size arraySize
        populateArray(array);//populates array with radnom ints from 0-1000
        
        
        /*prints time in milliseconds how long each sorting algorithm 
            takes to sort the array */
        SortingAlgorithms.bubbleSortElapsedTime(array);
        SortingAlgorithms.bubbleSortCSElapsedTime(array);
        SortingAlgorithms.selectionSortElapsedTime(array);
        SortingAlgorithms.insertionSortElapsedTime(array);
        
    }//main
    
    
    public static void populateArray(int[] array) {
        
        Random rnd = new Random();
        
        for(int i = 0; i < array.length; i++) {
            
            int random = rnd.nextInt(1001);
            array[i] += random;
        }
        
    }//populateArray with random ints from 0-1000
    
    

    
    
}//class
