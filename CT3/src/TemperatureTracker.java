import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
			ArrayList<String> days = new ArrayList<>();
			ArrayList<Double> temperatures = new ArrayList<>();
			String input = null;
			double sum = 0;

			// Input loop
			while (days.size() < 7) {
			    System.out.print("Enter a day of the week or 'week' for a summary: ");
			    input = scanner.nextLine();

			    if (input.equalsIgnoreCase("week")) {
			        break;
			    } else {
			        days.add(input);
			        System.out.print("Enter the average temperature for " + input + ": ");
			        double temp = scanner.nextDouble();
			        scanner.nextLine(); // consume the remaining newline
			        temperatures.add(temp);
			    }
			}

			// Display and calculate
			if (input.equalsIgnoreCase("week")) {
			    System.out.println("Weekly Summary:");
			    for (int i = 0; i < days.size(); i++) {
			        System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
			        sum += temperatures.get(i);
			    }
			    double average = sum / days.size();
			    System.out.println("Weekly Average Temperature: " + average + " degrees");
			} else {
			    int index = days.indexOf(input);
			    if (index != -1) {
			        System.out.println(input + ": " + temperatures.get(index) + " degrees");
			    } else {
			        System.out.println("No data for " + input);
			    }
			}
		}
    }
}