import java.util.Scanner;

public class Exercise2 {


    /**2 - Program that reads the temperature in Fahrenheit and converts it to Celsius.*/

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double convert = (fahrenheit - 32) / 1.8;

        System.out.printf("Celsius value %.2f", convert);

        scanner.close();
    }
    
}
