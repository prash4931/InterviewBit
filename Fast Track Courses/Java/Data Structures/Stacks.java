import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] A = new String[T];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.next();
            
        }
        
        for (int i = 0; i < T; i++) {
            System.out.println(match(A[i]));
        }

		sc.close();
    }
    public static String match(String s) {
		Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
            if (!stack.isEmpty()) {
                stack.pop();
            } else {
                return "0";
            }
            }
        }
        if (stack.isEmpty()) {
            return "1";
        } else {
            return "0";
        }
	}
}
