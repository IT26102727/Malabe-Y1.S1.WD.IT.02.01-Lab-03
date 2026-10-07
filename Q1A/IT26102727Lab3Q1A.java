import java.util.Scanner;

public class IT26102727Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1kg of rice: ");
        double price = scanner.nextDouble();
        
        System.out.print("number of kilograms to buy: ");
        double kg = scanner.nextDouble();
        
        double total = price * kg;
        
        System.out.println("total amount" + total);
        
        scanner.close();
    }
}