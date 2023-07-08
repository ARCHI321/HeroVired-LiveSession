package javaCodes.day12;

public class finalizeex1 {
    public static void main(String[] args) {
        finalizeex1 obj = new finalizeex1();
        System.out.println(obj.hashCode());
        obj = null;
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");

    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
