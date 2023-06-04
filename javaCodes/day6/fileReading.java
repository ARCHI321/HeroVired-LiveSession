package javaCodes.day6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileReading {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("D:/Hero vired/javaCodes/day6/fileread.txt"));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
