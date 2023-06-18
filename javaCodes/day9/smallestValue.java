package javaCodes.day9;
import java.util.*;

// Initialize two variables, smallest and secondSmallest,
// Iterate through each element in the array.
// Compare the current element with the smallest variable.
// If the current element is smaller than smallest, update both smallest and secondSmallest accordingly.
// If the current element is greater than or equal to smallest but smaller than secondSmallest, update secondSmallest only.
// After iterating through all the elements, secondSmallest will hold the second smallest element in the array.
// Return the value of secondSmallest.
// 1.Initialize two variables, smallest and secondSmallest, 
// 2.Iterate through each element in the array.
// 3.Compare the current element with the smallest variable.
// 4.If the current element is smaller than smallest, update both smallest and secondSmallest accordingly.
// 5.If the current element is greater than or equal to smallest but smaller than secondSmallest, update secondSmallest only.
// After iterating through all the elements, secondSmallest will hold the second smallest element in the array.
// 6Return the value of secondSmallest.

public class smallestValue {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3,7};
        int smallest = arr[0] , secSmallest = arr[1];
        for(int a:arr){
            if(a<smallest){
                secSmallest = smallest;
                smallest = a;
            }
            if(a<secSmallest && a!=smallest)
            {
                secSmallest=a;
            }
         }

         System.out.println(secSmallest);
         
        }
}

