using System;
using System.IO;
using System.Collections.Generic;

class MAIN  {
    public static void Main(string[] args) {
        // Declare a stack of integer type
        Stack<int> st = new Stack<int>();
        
        // Push the first 5 even numbers in the stack
        for (int i = 2; i <= 10; i+=2)
            st.Push(i);
        
        // Push the first 5 odd numbers in the stack
        for (int i = 1; i < 10; i+=2)
            st.Push(i);
        
        // Print the size of the stack
        Console.WriteLine(st.Count);
        
        // Remove the top most element of the stack
        st.Pop();
        
        // Print the elements of the stack from top to bottom
        // separated by space
        while (st.Count > 0) {
            int x = st.Pop();
            Console.Write(x + " ");
        }   
    }
}
