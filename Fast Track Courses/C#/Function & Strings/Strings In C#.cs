using System;
using System.IO;

class MAIN  {
    public static void Main(string[] args) {
        String str = Console.ReadLine();
        
        // Print the length of the string
        Console.WriteLine(str.Length);
        
        // Print the first index of the character 'a' in the string
        // If none present, print -1
        Console.WriteLine(str.IndexOf('a'));
        
        // Print the number of occurrences of the character 'b' in the string
        Console.WriteLine(str.Split('b').Length - 1);
        
        // Print the substring from the 1st index to the 4th index (inclusive)
        Console.WriteLine(str.Substring(2,3));
        
        // Check if the string is equal to "InterviewBit"
        // Print the resulting boolean
        Console.WriteLine(str.Equals("InterviewBit"));
    }
}
