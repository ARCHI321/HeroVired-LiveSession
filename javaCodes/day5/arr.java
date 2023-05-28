package javaCodes.day5;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 5;
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println();
        String name = "Archi";
        char [] alphabets = name.toCharArray();
        for(char c:alphabets){
            System.out.print(c + " ");
        }


        
        

        
    }
}
