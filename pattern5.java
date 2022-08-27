
class pattern5
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
if(i==1)
{
for(int j=1;j<=1;j++)
{
System.out.print("*");
}
}
else if(i==5)
{
System.out.print("******");
}
else
{
for(int j=1;j<=2;j++)
{
System.out.print("*");
}
}
System.out.println();
}
}
}
