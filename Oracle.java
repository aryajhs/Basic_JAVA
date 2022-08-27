class SunMicroSystem
{
             void JAVA()
             {
                        System.out.println("Java prog...");
              }
}
class Google extends SunMicroSystem
{
             void 

class Oracle extends Google
{
               void DBMS()
               {
                            System.out.println("sql...");
               }
               public static void main(String args[])
                {
                          Oracle obj= new Oracle();
                           obj.DBMS();
                           obj.JAVA();
                 }
}
                