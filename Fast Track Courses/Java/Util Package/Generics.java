import java.lang.*;
import java.util.*;
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   public void printArray(Object[] array) {
       if (array instanceof Integer[]) {
           Integer[] intarr = (Integer[]) array;
           for (Integer i : intarr) {
               System.out.println(i);
           }
       } else if (array instanceof String[]) {
           String[] strarr = (String[]) array;
           for (String s : strarr) {
               System.out.println(s);
           }
       }
   }
 
}

/*****Don't change anything in the code below*****/
public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
        
    }
}
