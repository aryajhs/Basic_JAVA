interface  dudu
{
abstract void wing1();

}
interface gand
{
abstract void wing2();

}
class hostel implements dudu, gand
{
void wing2()
{
System.out.println("maha chutiya");
}
void wing1()
{
  System.out.println("Chutiya");

}
public void  shivang()
{
System.out.println("madarchod");
}
public static void main(String arg[])
{
hostel obj= new hostel();
obj.shivang();
obj.wing1();
obj.wing2();
}
}