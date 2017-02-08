import java.util.Scanner;

public class ASH25{
  public static void main(String[] arg)
  {
     //Prompt user for subtotal and gratuity rate
     System.out.println("Enter the subtotal and a gratuity rate: ");
     //Get values
     Scanner in = new Scanner(System.in);
     double s = in.nextDouble();
     double g = in.nextDouble();
     //Calculate gratuity 
     g*=s/100;
     //Display gratuity and total amounts
     System.out.println("The gratuity is $"+g+" and total is $"+(s+g));
  }
}