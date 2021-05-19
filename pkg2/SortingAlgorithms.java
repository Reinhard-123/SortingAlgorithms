
package project6.pkg2;

import java.util.Arrays;


public class SortingAlgorithms {
    
    public static void BubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j< array.length-1-i; j++) {
                if( array[j] > array[j+1] ) {
                    int temp = array[i];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }//bubble sort algorithm
    
    public static void bubbleSortElapsedTime(int[] array) {
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(array);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble sort: " + elapsed + " ms");//Buble sort:
        
    }//bubblesort elapsed time method
    
    
    
    public static void BubbleSortCS(int[] array) {
        
        for(int i = 0; i < array.length - 1; i++) {
            
            boolean swap = false;
            for(int j = 0; j < array.length-i-1;j++ ) {
                
                if(array[j] > array[j+1]) {
                    
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }//if statement
            }//inside for loop
            
            if(!swap) {
                break;
            }
        }//outer for loop
    }//method 
    
     public static void bubbleSortCSElapsedTime(int[] array) {
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortCS(array);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble sort short circuit: " + elapsed + " ms");
        
    }//bubbleSortCS elapsed time method
     
     
    
    public static void SelectionSort(int[] array) {
        for(int i = 0; i <array.length - 1; i++) {
            int index = 1;
            
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
            }
            
            
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
    
     public static void selectionSortElapsedTime(int[] array) {
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.SelectionSort(array);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Selection sort: " + elapsed + " ms");
        
    }//selectionSort elapsed Time method

    
    
    public static void InsertionSort(int[] array) {
        int i;
        int j;
        int key;
        
        for(i = 1; i < array.length; i++) {
            key = array[i];
            j = i-1;
            
            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
            }
            
            array[j+1] = key;
            
        }    
    }//insertionSort method
    
    
    public static void insertionSortElapsedTime(int[] array) {
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.InsertionSort(array);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Insertion sort: " + elapsed + " ms");
        
    }//insertion sort elapsed time method
    
    
    
    public static void JavaSort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void cocktailSort(int[] array)
    {
        boolean swapped = true;
        int start = 0;
        int end = array.length;
 
        while (swapped == true) 
        {
            // reset the swapped flag on entering the
            // loop, because it might be true from a
            // previous iteration.
            swapped = false;
 
            // loop from bottom to top same as
            // the bubble sort
            for (int i = start; i < end - 1; ++i) 
            {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
 
            // if nothing moved, then array is sorted.
            if (swapped == false)
                break;
 
            // otherwise, reset the swapped flag so that it
            // can be used in the next stage
            swapped = false;
 
            // move the end point back by one, because
            // item at the end is in its rightful spot
            end = end - 1;
 
            // from top to bottom, doing the
            // same comparison as in the previous stage
            for (int i = end - 1; i >= start; i--) 
            {
                if (array[i] > array[i + 1]) 
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
 
            // increase the starting point, because
            // the last stage would have moved the next
            // smallest number to its rightful spot.
            start = start + 1;
        }
    }
    
}
