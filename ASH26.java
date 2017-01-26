import java.util.Scanner;

public class ASH26{
  public static void main(String[] arg)
  {
     //Prompt user to enter a number betwenn 0 and 1000
     System.out.println("Enter a number between 0 and 1000: ");
     //Get values
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     //Initilize sum
     int sum = 0;
     //Check for range of the input
     if(n>0&&n<1000){
       while(n>=1)
       { 
          //Using modulo operator with 10 to return unit's digit 
          //and add up to sum
          sum += n%10;
          //Divide n as integer by 10 to drop the unit's digit 
          n /= 10;
       }
       //Display sum
       System.out.println("The sum of the digits is "+sum);
     }
     else 
     {
        //Display errors
        System.out.println("Number out of range");
     }
     
  }
}
    