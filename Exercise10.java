import java.util.Scanner;


public class Exercise10 {

    /*
    This program will read two integers M and N, and then it will read an array of M lines per N columns 
    containing integers, with possible repetitions. Then, read an integer X that belongs to the array. 
    For each occurrence of X, show the values to the left, above, to the right, and below X, if any.
    */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        for ( int i = 0; i < mat.length; i++ ) {
            for ( int j = 0; j < mat[i].length; j++ ) {
                mat[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        for ( int i = 0; i < mat.length; i++ ) {
            for ( int j = 0; j < mat[i].length; j++) {
                if ( mat[i][j] == X ) {
                    System.out.println("Position " + i + "," + j + ":");
                    
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }

                    if ( i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }

                    if( j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }

                    if ( i < mat.length - 1 ) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }


        sc.close();
    }
    
}
