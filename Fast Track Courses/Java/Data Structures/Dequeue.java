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

        Deque<Integer> Q= new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 1) {
                Q.addLast(y);
            } else if (x == 2) {
                Q.addFirst(y);
            } else if (x == 3) {
                if (Q.size() != 0) {
                    System.out.println(Q.getFirst());
                } else {
                    System.out.println("-1");
                }
            } else if (x == 4) {
                if (Q.size() != 0) {
                    System.out.println(Q.getLast());
                } else {
                    System.out.println("-1");
                }
            } else if (x == 5) {
                if (Q.size() != 0) {
                    Q.removeFirst();
                }
            } else if (x == 6) {
                if (Q.size() != 0) {
                    Q.removeLast();
                }
            }
        }
        
    }
}
