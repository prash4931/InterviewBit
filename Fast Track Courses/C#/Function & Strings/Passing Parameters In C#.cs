using System;
using System.IO;

class MAIN  {
    // declare func1
    public static void func1(int val) {
        val = 2;
    }
    
    // declare func2
    public static void func2(ref int val) {
        val = 2;
    }
    
    public static void Main(string[] args) {
        int val = Convert.ToInt32(Console.ReadLine());
        int a = 0, b = 0;
        func1(val);
        a = val;        // stores the value of val after calling func1
        func2(ref val);
        b = val;        // stores the value of val after calling func2
        
        // Compare the values of a and b
        if (a == b) {
            Console.WriteLine("True");
        } else {
            Console.WriteLine("False");
        }
        
    }
}
