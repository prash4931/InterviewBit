using System;
using System.IO;

class MAIN  {
    public static void Main(string[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUT
        // E.g. 'StreamReader' for input & 'StreamWriter' for output

        int a = int.Parse(Console.ReadLine());
        long b = long.Parse(Console.ReadLine());
        char c = Console.ReadLine()[0];
        float d = Single.Parse(Console.ReadLine());
        double e = double.Parse(Console.ReadLine());

        Console.WriteLine(a);
        Console.WriteLine(b);
        Console.WriteLine(c);
        Console.WriteLine(d);
        Console.WriteLine(e);
    }
}
