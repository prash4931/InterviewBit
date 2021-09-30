import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        
        int sum = 0;
        int row_length = 0;
        while (row_length < M) {
            for (int i = 0; i < N; i++) {
                sum += arr[i][row_length];
            }
            System.out.print(sum + " ");
            row_length++;
            sum = 0;
        }
        
		
		sc.close();
        
    }
}
