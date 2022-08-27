abstract class AKTUniversity
{
         void btech()
         {
              System.out.println("btech from AKTU");
          }
}
class college
{
                void diploma()
                {
                             System.out.println("Self course");
                 }
                 public static void main(String args[])
                 {
                            college obj= new college();

                            AKTUniversity con = new AKTUniversity();
                            con.btech();
                  }
}