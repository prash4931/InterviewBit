import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    /*
     * Complete the 'getDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. String day
     *  2. String month
     *  3. String year
     */
      
    public static String getDay(String day, String month, String year) {
       Calendar cal = Calendar.getInstance();
       cal.set(Calendar.MONTH, Integer.valueOf(month)-1);
       cal.set(Calendar.DATE, Integer.valueOf(day));
       cal.set(Calendar.YEAR, Integer.valueOf(year));
       String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
       return dayName;
    }
    public static void main(String[] args) {
        
        /****don't alter the code below*************************************/
        
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
        /****************************************************/
        
    }
}
