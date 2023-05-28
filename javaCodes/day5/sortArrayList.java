package javaCodes.day5;

import java.util.Arrays;
import java.util.Comparator;

public class sortArrayList {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        System.out.println(Arrays.binarySearch(arr,2));

        int [] arr1 = new int[10];
        Arrays.fill(arr1, 100);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr.equals(arr1));
        System.out.println(Arrays.equals(arr, arr1));

        //descending orderr
        Integer[] arr2 = {1,3,4,2,6,7};
        Arrays.sort(arr2,Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
