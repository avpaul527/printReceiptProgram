package Receipt;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void printReceipt() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        double total = price * qty;

        Date todaysDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        String formattedDate = dateFormat.format(todaysDate);

        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Name", "Qty", "Price", "Total");
        System.out.println("----           ---         -----      ------");
        System.out.printf("%-15s %-10d $%-9.2f $%-9.2f%n", productName, qty, price, total);
        System.out.println();
        System.out.println("     Thank you. Come again!!!");
        System.out.println();
        System.out.println("Purchased on: " + formattedDate);
        System.out.println("----------------------------------------");

        scanner.close();


    }


    public static void main(String[] args) {

        printReceipt();
    }


}

