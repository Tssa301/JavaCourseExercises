import java.util.Scanner;

public class Exercise9 {

    /**
     * 9 - A gas station wants to determine which of its products is preferred by its customers. 
     * Write an algorithm to read the type of fuel supplied (coded as follows: 1.Alcohol 2.Gasoline 3.Diesel 4.End). 
     * If the user enters an invalid code (outside the range 1 to 4), a new code must be requested (until it is valid). 
     * The program will end when the code entered is number 4. You must write the message: "THANK YOU VERY MUCH" and the 
     * number of customers who supplied each type of fuel, as shown.

     * THANK YOU SO MUCH
     * Alcohol: 1
     * Petrol: 2
     * Diesel: 0
     */

     public static void main(String[] args) {
         

        Scanner sc = new Scanner(System.in);

        int fuel = sc.nextInt();

        int alcohol = 0;
        int petrol = 0;
        int diesel = 0;
    
        
        while(fuel != 4) {
            if (fuel == 1) {
                    alcohol = alcohol + 1;

            }
            else if (fuel == 2) {
                    petrol = petrol + 1;

            }
            else if (fuel == 3) {
                    diesel = diesel + 1;

            }

            fuel = sc.nextInt();
            
            
        }

        System.out.println("THANK YOU SO MUCH!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Petrol: " + petrol);
        System.out.println("Dew: " + diesel);

        sc.close();

     }
    
}
