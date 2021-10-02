import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 1) {
                q.add(y);
            } else if (x == 2) {
                if (q.size() != 0) {
                    System.out.println(Collections.max(q));
                } else {
                    System.out.println("-1");
                }
            } else if (x == 3) {
                if (q.size() != 0) {
                    q.remove(Collections.max(q));
                }
            }
        } 
        
    }
}
