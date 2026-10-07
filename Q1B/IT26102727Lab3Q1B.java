import java.util.Scanner;

public class IT26102727Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("price of 1kg of rice: ");
        double price = scanner.nextDouble();
        
        System.out.print("number of kilograms buy: ");
        double kg = scanner.nextDouble();
        
        double total = price * kg;
        double finalAmount = total;

        if (total > 1000) {
            finalAmount = total * 0.9; // 10% discount
        }

        System.out.println("Total = " + total);
        System.out.println("Final amount to pay = " + finalAmount);
        
        scanner.close();
    }
}