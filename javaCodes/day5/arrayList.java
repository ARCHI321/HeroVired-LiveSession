package javaCodes.day5;
import java.util.ArrayList;



public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        // To Modify a value
        arr.set(0, "C");
        System.out.println(arr);
    }
}
