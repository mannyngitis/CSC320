import java.util.Scanner;

public class LoopingConstruct {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			float total = 0, number, max = Float.MIN_VALUE, min = Float.MAX_VALUE;
			int count = 0;

			while (count < 5) {
			    System.out.print("Enter a floating-point value (" + (count + 1) + "/5): ");
			    try {
			        number = Float.parseFloat(scanner.nextLine());
			        total += number;

			        if (number > max) {
			            max = number;
			        }

			        if (number < min) {
			            min = number;
			        }

			        count++;
			    } catch (NumberFormatException e) {
			        System.out.println("Invalid input. Please enter a valid floating-point number.");
			    }
			}

			float average = total / 5;
			float interest = total * 0.20f;

			System.out.println("Total: " + total);
			System.out.println("Average: " + average);
			System.out.println("Maximum: " + max);
			System.out.println("Minimum: " + min);
			System.out.println("Interest on total at 20%: " + interest);
		}
    }
}