using System;
using System.IO;

class MAIN  {
    public static void Main(string[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUT
        // E.g. 'StreamReader' for input & 'StreamWriter' for output
        int N = int.Parse(Console.ReadLine());
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++) {
            arr[i] = int.Parse(Console.ReadLine());
        }

        Array.Reverse(arr);
        for(int i = 0; i < N; i++) {
            Console.WriteLine(arr[i]);
        }
    }
}
