import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius or Fahrenheit:");
        String temp = input.nextLine();
        char unit = temp.charAt(temp.length() - 1); // get the last character
        double value = Double.parseDouble(temp.substring(0, temp.length() - 1)); // get the numerical part
        double result = 0;
        if (unit == 'C' || unit == 'c') {
            // convert Celsius to Fahrenheit
            result = value * 9 / 5 + 32;
            System.out.println(temp + " is equal to " + result + "F");
        } else if (unit == 'F' || unit == 'f') {
            // convert Fahrenheit to Celsius
            result = (value - 32) * 5 / 9;
            System.out.println(temp + " is equal to " + result + "C");
        } else {
            // invalid input
            System.out.println("Invalid temperature unit. Please enter C or F at the end.");
        }
        input.close();
    }
}
