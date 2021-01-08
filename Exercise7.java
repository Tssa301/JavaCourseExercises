import java.util.Scanner;

public class Exercise7 {
    

    /**
     * 7 - Write a program that repeats reading a password until it is valid. 
     * For each incorrect password reading entered, write the message "Invalid password". 
     * When the password is entered correctly, the message "Access Allowed" should be printed 
     * and the algorithm terminated. Consider that the correct password is the value 2002. 
     */


     public static void main(String[] args) {
         

        Scanner sc = new Scanner(System.in);

        int password =sc.nextInt();

        
        while (password != 2002) {
            System.out.println("Invalid password");
            password = sc.nextInt();
        }

        System.out.println("Access Allowed");

        sc.close();
     }
     
}
