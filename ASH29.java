import java.util.Scanner;
import java.text.DecimalFormat;
public class ASH29{
  public static void main(String[] arg)
  {
     //Prompt user to input values
     System.out.println("Enter v0, v1, and t :");
     //Get values
     Scanner in = new Scanner(System.in);
     double v0 = in.nextDouble();
     double v1 = in.nextDouble();
     double t  = in.nextDouble();
     //Calculate acceleration
     double a  = (v1-v0)/t;
     //Roundup upto 4 decimals
     DecimalFormat df = new DecimalFormat("#.####");
     //Display value
     System.out.println("The average acceleration is "+df.format(a));
  }
}