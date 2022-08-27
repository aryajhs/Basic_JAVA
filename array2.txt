import java.util.Arrays;
import java.util.Scanner;
class array2
{
           public static void main(String args[])
           {
               String str;
     
               Scanner sc = new Scanner(System.in);
               System.out.println("enter your string");
              
               str=sc.next();
              
               char charray[] = str.tocharArray();
               Arrays.sort(charArray);
               System.out.println(new String(charArray));
            
                       
                    
            }
}
