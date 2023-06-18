package javaCodes.day8;

import java.util.*;

public class encapsulationTest1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){  
        this.name=name;
     }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encapsulationTest1 s = new encapsulationTest1();
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("The name you entered : " + s.getName());
        sc.close();
    }
}
