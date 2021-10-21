using System;
using System.IO;

class MAIN  {
    public static void Main(string[] args) {
        int num1 = Convert.ToInt32(Console.ReadLine());
        
        // Find the factorial of num1 and print it in a separate line
        int factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
        }
        Console.WriteLine(factorial);
        
    
        int num2 =  Convert.ToInt32(Console.ReadLine());
        
        // Find the highest power of 2 that divides num2
        // and print it in a separate line
        int power = num2 & (~(num2-1));
        int count = 0;
        while (power >= 2) {
            power = power /2;
            count++;
        }
        Console.WriteLine(count);
    }
}
