import java.util.Scanner;

public class Exercise6 {


    /**6 - Program that solves second degree equations (ax2 + bx + c = 0) using Bhaskara's formula. 
           Use as an example: a = 1, b = 12 and c = -13. Find the Delta */

    public static void main(String[] args) {
               

        Scanner scanner = new Scanner(System.in);

        System.out.println("Equation: ax² + bx + c = 0");
        
        System.out.println("\nEnter the value of A: ");
        int a = scanner.nextInt();
        
        System.out.println("\nEnter the value of B: ");
        int b = scanner.nextInt();
        
        System.out.println("\nEnter the value of C: ");
        int c = scanner.nextInt();

        int delta = (b * a) - (4 * a * c);
        
        System.out.printf("Your equation is: %dx² + %dx + %d = 0", a, b, c);

        System.out.println("\nDelta is: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("The x1 of the equation is: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nThe x2 of the equation is: %.2f", x2);

        scanner.close();
    }
    
}
