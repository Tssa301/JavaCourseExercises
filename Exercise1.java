import java.util.Scanner;

public class Exercise1 {
    

    /** 1 - Program that reads the temperature in Celsius and converts it to Fahrenheit.*/

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double convert = (celsius * 1.8) + 32;

        System.out.printf("Fahrenheit value: %.2f", convert);

        scanner.close();
    }
}