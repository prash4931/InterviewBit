import java.lang.*;
import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        BigDecimal max, min;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                String si = s[i], sj = s[j];
                if (new BigDecimal(si).compareTo(new BigDecimal(sj)) < 0) {
                    s[i] = sj;
                    s[j] = si;
                }
            }
        }    

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        
    }
}
