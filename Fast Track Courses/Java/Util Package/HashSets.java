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
        int count = 0;

        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < N; i ++) {
            int A = sc.nextInt();
            if (num.contains(A)) {
                num.add(A);
            } else {
                num.add(A);
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
