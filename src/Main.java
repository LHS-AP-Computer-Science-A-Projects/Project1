// Import the Scanner utility class from the Java API.
import java.util.Scanner;

/**
 * Converts an inputted kilometer distance to nautical miles.
 */
public class Main {

	// Method header.
	public static void main(String[] args) {
		// Instantiate the scanner object.
		Scanner scanner = new Scanner(System.in);

		// Print a line requesting the user to input a number value.
		System.out.println("How many kilometers would you like to convert to nautical miles?");
		// Will allow either integer or double inputs to be defined as the kilometer
		// value.
		double kilometers = scanner.nextDouble();

		/**
		 * Conversion from kilometers to nautical miles:
		 * > 90 degrees between the North Pole and the equator
		 * > 10,000 km between the N.P. and the equator
		 * > > 90 degrees / 10,000 km = 0.009 degrees / km
		 * > > 0.009 degrees / km * (60 minutes / degree) = 0.54 minute / km
		 */

		// Converts the inputted kilometer value to nautical miles following the
		// conversion steps.
		double nautMi = kilometers * 90.0 / 10000 * 60;

		// Prints in the command line the converted result.
		System.out.println(kilometers + " kilometers is equivalent to " + nautMi + " nautical miles.");

		// Closes the scanner to end the runnable.
		scanner.close();
	}
}