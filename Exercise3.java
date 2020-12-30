import java.util.Scanner;

public class Exercise3 {


    /**3 - Program that reads the user's weight and height and prints the BMI on the console.*/

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert weight:");
        double weight = scanner.nextDouble();

        System.out.println("Insert height:");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.3f", bmi);


        scanner.close();
    }
    
}
