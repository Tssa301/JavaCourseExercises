import java.util.Scanner;

public class Exercise5 {


    /**5 - Program that reads the base value and the height of a triangle and calculates the area.*/

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Base: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the Height: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is:  " + area);

        scanner.close();
    }
    
}
