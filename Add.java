import java.util.Scanner;
 
class AddNumbers
{
   public static void main(String args[])
   {
      int w,x, y, z;
 
      System.out.println("Enter three integers to calculate their sum");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z=  in.nextInt();
      w = x + y+ z;
     
      System.out.println("Sum of the integers = " + w);
   }
}
