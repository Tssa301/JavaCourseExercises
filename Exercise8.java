import java.util.Scanner;

public class Exercise8 {

    /**
     * 8 - This program reads the coordinates (X, Y) of an undetermined number of points 
     * in the Cartesian system. For each point, write the quadrant to which it belongs. 
     * The algorithm will be terminated when at least one of the two coordinates is NULL 
     * (in this situation without writing any message).
     */

     public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");

            }
            else if (x < 0 && y > 0) {
                System.out.println("Second");

            }
            else if (x < 0 && y < 0) {
                System.out.println("Third");

            }
            else {
                System.out.println("Fourth");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
         
     }

    
}
