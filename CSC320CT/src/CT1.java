import java.util.Scanner;

public class CT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for information
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your street address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your zip code: ");
        String zipCode = scanner.nextLine();

        // Print the information
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}
