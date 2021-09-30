import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
		
		Queue queue = new LinkedList();
		
		int Q = sc.nextInt();
		
		for (int i = 0; i < Q; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if (x == 1) {
		        
		        queue.add(y);
		    } else if (x == 2) {
		        if (!queue.isEmpty()) {
		            System.out.println(queue.element());
		        } else {
		            System.out.println("-1");
		        }
		    } else if (x == 3) {
		        if (!queue.isEmpty()) {
		            queue.remove();
		        }
		    }
		}
		
		sc.close();
        
    }
}
