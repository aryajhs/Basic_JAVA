class SunMicroSystem
{
          void JAVA()
          {
                       System.out.println("Java prog..");
           }
          //overridden
            void clang()
           {
                       System.out.println("c prog by sun micro...base");
            }
}
class Oracle2 extends SunMicroSystem
{
             //override
             void clang()
             {
                        System.out.println("c prog by oracle..Derived");
              }
             void DBMS()
             {
                         System.out.println("sql...");
             }
             public static void main(String args[])
             {
                 Oracle2 obj= new Oracle2();
                  obj.clang();
            }
}