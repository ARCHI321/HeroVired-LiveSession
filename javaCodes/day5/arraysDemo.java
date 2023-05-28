package javaCodes.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysDemo {
    public static void main(String[] args) {
        String[] words = {"Hello" , "World"};
        ArrayList<String> al= new ArrayList<>(Arrays.asList(words));
        System.out.println(al);
        al.remove(1);
        al.add("Java");
        System.out.println(al);
        String[] array = al.toArray(new String[al.size()]);
        System.out.println(array);
        for(String s:array){
            System.out.print(s+" ");
        }

    }
}
