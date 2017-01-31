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
public class ASH420 {
   public static void main (String args[]){
   
	Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String a = input.nextLine();
	        char ch = a.charAt(0);
                int length;
                length = a.length();
                System.out.println("length of string is " + length + " first character is " + ch );
                
   }
}
