package javaCodes.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class bufferedReaderFileRead {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("D:/Hero vired/javaCodes/day6/fileread.txt"))){
             String line;
             while((line=br.readLine()) != null){
                System.out.println(line);
             }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
