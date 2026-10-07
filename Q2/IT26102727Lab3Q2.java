import java.util.Scanner;

public class IT26102727Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        System.out.print("OT hours: ");
        double otHours = scanner.nextDouble();
        
        System.out.print("OT hourly rate: ");
        double otRate = scanner.nextDouble();
        
        double otAmount = otHours * otRate;
        double totalSalary = monthlySalary + otAmount;
        
        System.out.println("total salary including OT: " + totalSalary);
        
       
    }
}