/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
import java.util.Scanner;
public class ASH35 {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number for today's day from 0 to 6: ");
	  int day = input.nextInt();
	System.out.print("Enter a number of days elapsed since today: ");
	  int dayElapsed = input.nextInt();
	  dayElapsed = (day + dayElapsed)% 6 ; 
	  String str1 = null;
	  String str2 = null;
			  switch(day) {
        case 0 :
            str1 = "Sunday";
            break;
        case 1 :
            str1 = "Monday";
            break;
        case 2 :
        	str1 = "Tuesday";
        	break;
        case 3 :
        	str1 ="Wednesday";
        	break;
        case 4 :
        	str1 = "Thursday";
        	break;
        case 5 :
        	str1 = "Friday";
        	break;
        case 6 :
            str1 = "Saturday";
            break;
     }
	   switch (dayElapsed) {
	  case 0 : 
		  str2= "Sunday" ;
		  break;
	  case 1 :
		  str2 = "Monday"; 
		  break;
	  case 2 : 
		  str2= "Tuesday";
		  break;
	  case 3 : 
		  str2 = "Wednesday";
		  break;
	  case 4 : 
		  str2 = "Thrusday";
		  break;
	  case 5 : 
		  str2 = "Friday";
		  break;
	  case 6 : 
		  str2 = "Saturday";
		  break;
	}
	   System.out.println("Today is " + str1 + " and Future day is " + str2);
	}
}