package javaCodes.assignment2;

import java.util.*;

abstract class car {
    abstract void accelerator();

    abstract void brake();

    abstract void clutch();

    public void key() {
        System.out.println("car started");
    }

}

class mercedes extends car {
    void accelerator() {
        System.out.println("Accelerator");
    }

    void brake() {
        System.out.println("Brake");
    }

    void clutch() {
        System.out.println("Clutch");
    }

    void airbag() {
        System.out.println("best 6 airbags");
    }
}

class thar extends car {
    void accelerator() {
        System.out.println("Accelerator");
    }

    void brake() {
        System.out.println("Brake");
    }

    void clutch() {
        System.out.println("Clutch");
    }

    void airbag() {
        System.out.println("best 9 airbags");
    }
}

public class practise1 {
    public static void main(String[] args) {
        thar m = new thar();
        m.clutch();
        m.airbag();
        m.brake();
        m.accelerator();
    }
}
