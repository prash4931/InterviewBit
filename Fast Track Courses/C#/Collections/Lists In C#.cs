using System;
using System.IO;
using System.Collections.Generic;
class MAIN  {
    public static void Main(string[] args) {
        // Declare a list of integer type
        List<int> L = new List<int>();
        
        // Add all numbers from 1 to 10 to the end
        for (int i = 1; i <= 10; i++) {
            L.Add(i);
        }
        
        // Remove element from the beginning
        L.RemoveAt(0);
        
        // Remove 8 from the list
        L.Remove(8);
        
        // Insert 4 at the 1st index
        L.Insert(1,4);
        
        // Print the elements of the list separated by a space
        foreach(int i in L)
            Console.Write(i + " "); 
        
        // Reverse the list
        L.Reverse();
        
        // Print the elements of the list separated by a space
        Console.WriteLine();
        foreach(int i in L)
            Console.Write(i + " ");
        
        // Sort the list
        L.Sort();
        
        // Print the elements of the list separated by a space
        Console.WriteLine();
        foreach(int i in L)
            Console.Write(i + " ");
    }
}
