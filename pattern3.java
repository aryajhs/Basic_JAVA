import java.util.Scanner;
class pattern3
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter chutiye");
int n=sc.nextInt();
for(int i=1;i<=n-1;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
for(int k=n;k>=1;k--)
{
for(int p=k;p>=1;p--)
{
System.out.print("*");
}
System.out.println();
}
}
}