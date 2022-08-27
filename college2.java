abstract class AKTUniversity
{
         void btech()
         {
              System.out.println("btech from AKTU");
          }
          abstract void manager(); //declaration
}
class college3 extends AKTUniversity
{
               //override
                void manager()
                {
                            System.out.println("AKTU manager");
                 }
                void diploma()
                {
                             System.out.println("Self course");
                 }
                 public static void main(String args[])
                 {
                            college3 obj= new college3();

                            obj.btech();
                             obj.manager();
                  }
}