using System;
using System.IO;
using System.Collections.Generic;

class MAIN  {
    public static void Main(string[] args) {
        // Declare a queue of integer type
        Queue<int> q = new Queue<int>();

        
        // Push the first 5 even numbers in the queue
        for (int i = 2; i <= 10; i+=2)
            q.Enqueue(i);
        
        // Push the first 5 odd numbers in the queue
        for (int i = 1; i < 10; i+=2)
            q.Enqueue(i);
        
        // Print the size of the queue
        Console.WriteLine(q.Count);
        
        // Remove the oldest element of the olders
        q.Dequeue();
        
        // Print the elements of the queue from oldest to newest
        // separated by space
        while(q.Count > 0)
            Console.Write(q.Dequeue() + " ");
    }
}
