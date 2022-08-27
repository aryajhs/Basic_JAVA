class Amity
{
     Amity()
{
System.out.println("Amity");
}

         Amity(int a)
         {
                   System.out.println("Amity..single Para cons..base");
          }
         Amity(int a,int b)
         {
                   System.out.println("Amity..double Para cons..base");
          }
}
class GLA extends Amity
{
            GLA()
            {

                     System.out.println("GLA ...non para  cons..desired");
             }
              GLA(int z)
            {
super();
 
                     System.out.println("GLA ...Paracons..desired");
             }
              GLA(int z , int y)
            {
                     System.out.println("GLA ...Paracons..desired");
             }
             public static void main(String  args[])
             {
                   GLA obj = new GLA();
   
                    
              }
}