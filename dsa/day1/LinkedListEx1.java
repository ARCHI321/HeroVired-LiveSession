import java.util.*;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("1");
        linked_list.add("2");
        linked_list.add("3");
        System.out.println(linked_list);
        System.out.println(linked_list.getFirst());
        System.out.println(linked_list.getLast());
    }
}
