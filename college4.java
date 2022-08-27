interface AKTUniversity
{
         abstract void btech();
        static void func()
        {
                  System.out.println("Static fn is working in interface");
       
}
 
class college6 implements AKTUniversity
{
               //override
                public void btech()
                {
                            System.out.println("Btech program");
                 }
              
                 public static void main(String args[])
                 {
                            college4 obj= new college4();

                            obj.btech();
                           AKTUniversity.func();
                  }
}