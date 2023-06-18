package javaCodes.day8;
import java.util.*;

public class StringOprations {
    public static void main(String[] args) {
        // char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        // String s = new String(ch);
        // System.out.println(s);
        // System.out.println(s.length());
        // System.out.println(s.trim());
        // String s1 = "Hello , my , name";
        // String[] s2 = s1.split(",");
        // for(String x:s2){
        //     System.out.println(x);
        // }

        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        for(int b:arr){
            System.out.println(b);
        }
        Arrays.fill(arr, 56);

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.set(2, 999);
        System.out.println(a);
        System.out.println(a.toString());
        a.forEach((x) ->{
            System.out.println(x);
        });
        for(int cc:a){
            System.out.println(cc);
        }

    }
}
