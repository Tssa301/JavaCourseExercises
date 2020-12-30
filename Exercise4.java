import java.util.Scanner;

public class Exercise4 {


    /**4 - Program that reads a value and presents the results in the square and cube of the value.*/

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value: ");
        double value = scanner.nextDouble();

        double square = Math.pow(value, 2);
        double cube = Math.pow(value, 3);

        System.out.println("The square value is: " + square + "\n The cube value is: " + cube);

        scanner.close();
    }
    
}
