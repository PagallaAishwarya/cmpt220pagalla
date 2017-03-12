/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */

import java.util.Scanner;

public class ASH911 {
    
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LINEAREQUATION linear = new LINEAREQUATION(a,b,c,d,e,f);

        if (linear.isSolvable()) {
            System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}


