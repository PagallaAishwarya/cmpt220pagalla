/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw
 */
public class ASH1023A {

    public static void main(String[] args) {

        System.out.println(new ASH1023("I'm a string.").toChars());
        ASH1023 s1 = new ASH1023("test123");
        ASH1023 s2 = new ASH1023("test123");
        System.out.println("s1 = " + s1.toString());
        System.out.println("s2 = " + s2.toString());
        System.out.println("Is s1 equal to s2? " + s1.compare(s2));
        System.out.println("Value of false changed to uppercase = " + (ASH1023.valueOf(false).toUpperCase().toString()));
        System.out.println("Value of true = " + (ASH1023.valueOf(true).toString() ));

    }
}
    

