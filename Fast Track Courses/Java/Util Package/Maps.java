import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        Map<String, Integer> students = new HashMap<>();

        for (int i = 0; i < A; i++) {
            String name = sc.next();
            int totalMarks = sc.nextInt();
            students.put(name,totalMarks);
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String findname = sc.next();
            if (students.containsKey(findname)) {
                System.out.println(students.get(findname));
            } else {
                System.out.println("Not Found");
            }
        }

        sc.close();
        
    }
}
