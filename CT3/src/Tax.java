import java.util.Scanner;

public class Tax {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income, taxWithholding;

        while (true) {
            System.out.print("Enter your weekly income: ");
            try {
                income = Double.parseDouble(scanner.nextLine());
                
                if (income < 0) {
                    System.out.println("Income cannot be negative. Please enter a valid amount.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            }
        }

        taxWithholding = calculateTax(income);
        System.out.printf("Weekly Tax Withholding: $%.2f%n", taxWithholding);
    }

    private static double calculateTax(double income) {
        if (income < 500) {
            return income * 0.10;
        } else if (income < 1500) {
            return income * 0.15;
        } else if (income < 2500) {
            return income * 0.20;
        } else {
            return income * 0.30;
        }
    }
}
