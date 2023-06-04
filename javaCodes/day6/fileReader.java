package javaCodes.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/Hero vired/javaCodes/day6/fileread.txt");
        int i;
        while((i= fr.read()) != -1){
           System.out.print((char)i);
        }
        fr.close();
    }
}
