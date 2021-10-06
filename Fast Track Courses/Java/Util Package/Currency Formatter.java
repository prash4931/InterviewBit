import java.lang.*;
import java.util.*;
import java.text.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.

        Locale ind = new Locale("en","IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(ind);

        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        
    }
}
