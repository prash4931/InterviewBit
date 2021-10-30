using System;
using System.IO;
using System.Collections.Generic;
class MAIN  {
    public static void Main(string[] args) {
        // Declare a linked list of integer type
        LinkedList<int> L = new LinkedList<int>();
        
        // Add all numbers from 1 to 10 to the beginning
        for (int i = 1; i <= 10; i++) {
            L.AddFirst(i);
        }
        
        
        // Remove 3 elements from the beginning
        for (int i = 1; i <= 3; i++) {
            L.RemoveFirst();
        }
        
        // Print the elements of the list separated by a space
        foreach(int i in L) {
            Console.Write(i + " ");
        }
        
        // Remove 3 elements from the end
        for (int i = 1; i <= 3; i++) {
            L.RemoveLast();
        }
        Console.WriteLine();
        
        // Print the elements of the list separated by a space
        foreach(int i in L) {
            Console.Write(i + " ");
        }
        
        // Find how many multiples of 3 are present in the list
        int count = 0;
        Console.WriteLine();
        foreach(int i in L) {
            if (i % 3 == 0)
                count++;
        }
        Console.WriteLine(count);
        
        // Find the length of the list
        Console.WriteLine(L.Count);
        
        // Print the last element in the list
        Console.Write(L.Last.Value);
        
    }
}
