package javaCodes.day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class samplee {
    private final static String filePath = "D:/Hero vired/javaCodes/day7/restaurant.csv";
    private static final DateTimeFormatter DATE_FORMATTER = null;
    public static Scanner scanner = new Scanner(System.in);

    // Method to write order data to CSV file
    public static void writeOrderData(String[] orderData) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));     
         if (br.readLine() != null) {
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(filePath,true))) {
                for(String a:orderData){
                    wr.write(a);
                    wr.write(",");
                }
                wr.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
         else{
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(filePath))) {
                wr.write("waiter,customer,item,sales,orderMode,tipAmount");
                for(String a:orderData){
                    wr.write(a);
                    wr.write(",");
                }
                wr.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
        

    }

    // Method to read order data from CSV file
    public static HashMap<Integer, ArrayList<String>> readOrderData() {
        HashMap<Integer, ArrayList<String>> arr = new HashMap<Integer, ArrayList<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            br.readLine();
            int orderId=0;
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> values = new ArrayList<String>();
                String[] args = line.split(",");
                values.add(args[0]);
                values.add(args[1]);
                values.add(args[2]);
                values.add(args[3]);
                values.add(args[4]);
                values.add(args[5]);
                values.add(args[6]);

                arr.put(orderId, values);
                orderId++;

            }

            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return(arr);
        
    }

    // Method to calculate total sales
    public static double calculateTotalSales(HashMap<Integer, ArrayList<String>> orderDataList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String date = formatter.format(LocalDate.now());
        double total = 0.0;
        for(int i=0;i<orderDataList.size();i++){
            if(orderDataList.get(i).get(5).equals(date)){
                total += Double.parseDouble(orderDataList.get(i).get(4));

            }
        }

        return(total);
        

    }

    // Method to search for orders by customer name
    public static void searchOrdersByCustomerName(HashMap<Integer, ArrayList<String>> orderDataList) {
        System.out.print("Enter customer name : ");
        String customername = scanner.nextLine();
        for(int i=0;i<orderDataList.size();i++){
            if(orderDataList.get(i).get(1).equals(customername)){
                String item = orderDataList.get(i).get(2);
                String orderDate = orderDataList.get(i).get(5);
                System.out.println("Customer : " + customername + " ordered " + item + " on " + orderDate);

            }
        }
    }


    // Method to find online orders on a particular date
    public static void findOnlineOrdersByDate(HashMap<Integer, ArrayList<String>> orderDataList) {
        String mode = "online";
        for(int i=0;i<orderDataList.size();i++){
            if(orderDataList.get(i).get(3).equals(mode)){
                String item = orderDataList.get(i).get(2);
                String customername = orderDataList.get(i).get(1);
                String orderDate = orderDataList.get(i).get(5);
                System.out.println("Customer : " + customername + " ordered " + item + " on " + orderDate + " in online mode ");

            }
        }
    }

    // Method to find the waiter who handled the maximum number of customers

    public static String findMaxCustomerWaiter(HashMap<Integer, ArrayList<String>> orderDataList) {
        HashMap<String,Integer> waiterCount = new HashMap<String,Integer>();
        int existingCount=0;
        for(int i=0;i<orderDataList.size();i++){
            int count = 0;
            if(!waiterCount.containsKey(orderDataList.get(i).get(0))){
                  count++;
                  waiterCount.put(orderDataList.get(i).get(0), count);
            }
            else{
                  existingCount = waiterCount.get(orderDataList.get(i).get(0));
                  existingCount++;
                  waiterCount.put(orderDataList.get(i).get(0), existingCount);
            }
        }
        System.out.println(waiterCount);
        int maxCount=0;
        String maxCountWaiter="";
        for(String name:waiterCount.keySet()){
            if( waiterCount.get(name) > maxCount){
                maxCountWaiter = name;
            }
        }


        return(maxCountWaiter);


    }

    public static void main(String[] args) throws IOException {
        

        while (true) {
            System.out.println("----------- Restaurant System Menu -----------");
            System.out.println("1. Place an Order");
            System.out.println("2. Calculate Total Sales for the Day");
            System.out.println("3. Search Orders by Customer Name");
            System.out.println("4. Find Online Orders on a Date");
            System.out.println("5. Find Waiter Handling Maximum Customers");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            HashMap<Integer, ArrayList<String>> orderDataList = readOrderData();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter waiter name: ");
                    String waiterName = scanner.nextLine();

                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();

                    System.out.print("Enter sales amount: ");
                    double salesAmount = scanner.nextDouble();

                    System.out.print("Enter order mode (online/offline): ");
                    String orderMode = scanner.next();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter tip amount: ");
                    double tipAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character


                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

                    String[] orderData = {
                            waiterName,
                            customerName,
                            itemName,
                            orderMode,
                            String.valueOf(salesAmount),
                            formatter.format(LocalDate.now()),
                            String.valueOf(tipAmount)
                    };
                    writeOrderData(orderData);
                    break;

                case 2:
                    double totalSales = calculateTotalSales(orderDataList);
                    System.out.println("Total sales for the day: $" + totalSales);
                    break;

                case 3:
                    searchOrdersByCustomerName(orderDataList);
                    break;

                case 4:
                    findOnlineOrdersByDate(orderDataList);
                    break;

                case 5:
                    String maxCustomerWaiter = findMaxCustomerWaiter(orderDataList);
                    System.out.println("Waiter who handled the maximum number of customers: " + maxCustomerWaiter);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

}