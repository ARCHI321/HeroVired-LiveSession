package javaCodes.day6;

import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        String fn = "D:/Hero vired/javaCodes/day6/first.txt";
        File f1 = new File(fn);
        f1.createNewFile();
        System.out.println("File "+ f1.getName() + " created." );
        System.out.println(f1.getAbsolutePath());
    }
}
