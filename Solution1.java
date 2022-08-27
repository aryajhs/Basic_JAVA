 import java.util.*;

public class Solution1 {
    
    
    public static void main(String[] args) {
        String str;
        int n;
         Scanner sc = new Scanner(System.in);
         str=sc.next();
         n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             str=sc.next();
}
         for(int j=1;j<=n;j++)
         {
            String str2= j+str;
             System.out.println(str2);
         }
         
    }
}