class Amity
{
         Amity()
         {
                   System.out.println("Amity..non..para..base");
          }
         Amity(int a)
         {
                   System.out.println("Amity..Para cons..base");
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
                     System.out.println("GLA ...Paracons..desired");
             }
             public static void main(String  args[])
             {
                   GLA obj = new GLA();
                    obj.Amity();
                    
              }
}