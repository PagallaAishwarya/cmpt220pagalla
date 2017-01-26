import java.util.Scanner;

public class ASH21{
  public static void main(String[] arg)
  {
     //Prompt a Celsius value
     System.out.println("Enter a degree in Celsius: ");
     //Get values from user
     Scanner in = new Scanner(System.in);
     double c = in.nextDouble();
     //Calculate Fahrenheit value
     double f = (9.0/5)*c+32;   
     //Display Fahrenheit value
     System.out.println(c+" Celsius is "+f+" Fahrenheit");
  }
}