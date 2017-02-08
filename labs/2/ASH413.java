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
public class ASH413 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        String h = input.nextLine();
        char ch =h.charAt(0);
        if(ch == 'a'){
            System.out.println("Character is vouel");
        }
        else if (ch == 'e'){
            System.out.println("Character is vouel");
        }
        else if (ch == 'i'){
            System.out.println("Character is vouel");
        }
        else if (ch == 'o'){
            System.out.println("Character is vouel");
        }
        else if (ch == 'u'){
            System.out.println("Character is vouel");
        }
        else{
            System.out.println("Character is Consonant");
        }         
    }
}
