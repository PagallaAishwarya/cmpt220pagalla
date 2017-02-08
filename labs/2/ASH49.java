/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.Scanner;

/**
 *
 * @author aishw
 */
public class ASH49 {
    public static void main(String args[])
{ 
	Scanner input = new Scanner(System.in);
		System.out.println("Enter a Character");
		String a = input.nextLine();
	    char ch = a.charAt(0);
	    System.out.println("The character entered is " + ch);
	    System.out.println("The UniCode for Character "+ch + " is "+ (int)ch);
}

}
