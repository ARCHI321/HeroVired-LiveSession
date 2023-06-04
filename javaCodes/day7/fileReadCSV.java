package javaCodes.day7;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class fileReadCSV {
    private final static String filePath = "D:/Hero vired/javaCodes/day7/fileRead.csv";

    public static void printSalaryAboveLimit(HashMap<Integer, ArrayList<String>> arr , String limit) throws IOException{
        System.out.println("---------------------------------------------------------");
        System.out.println("Printing only those who are above the limit of Rs " + limit);
        System.out.println("---------------------------------------------------------");
        arr.forEach((k, v) -> {
            String name = v.get(0);
            int salary = Integer.parseInt(v.get(2).trim());
            int l = Integer.parseInt(limit);
            if(salary>l){
                System.out.println("Employee : " + name + ", Salary : "  +salary);
            }
        });
    }



    private static void writeDataToCSV() throws IOException {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(filePath))) {
            wr.write("empID,empName,designation,salary");
            wr.newLine();
            wr.write("1001,Archisman,Software Developer,80000");
            wr.newLine();
            wr.write("1002,Ritwik,Tester,26000");
            wr.newLine();
            wr.write("1003,Rishabh,Tester,45000");
            wr.newLine();
            wr.write("1004,Upalabdhi,Tester,56000");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void readDataFromCSV() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            HashMap<Integer, ArrayList<String>> arr = new HashMap<Integer, ArrayList<String>>();
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> values = new ArrayList<String>();
                String[] args = line.split(",");
                // String name = args[1];
                // int empId = Integer.parseInt(args[0]);
                // System.out.println(name + " " + empId);
                int empId = Integer.parseInt(args[0].trim());
                values.add(args[1]);
                values.add(args[2]);
                values.add(args[3]);

                arr.put(empId, values);

            }

            arr.forEach((k, v) -> {
                System.out.println(k + "-" + v);
            });
            // System.out.print("Enter the limit : ");
            // int limit = Integer.parseInt(br.readLine());
            String limit = "40000";
            printSalaryAboveLimit(arr , limit);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        writeDataToCSV();
        readDataFromCSV();

    }

}
