import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        ArrayList arraylist = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            if (a >= 0) {
                arraylist.add(a);
            } else if (a < 0) {
                break;
            }
        }

        for (int i = arraylist.size() - 1; i >=0; i--) {
            System.out.print(arraylist.get(i) + " ");
        }
        
        
    }
}
