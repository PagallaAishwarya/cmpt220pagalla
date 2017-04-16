/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author aishw
 */
public class ASH1311 {

    public static void main(String[] args) {
        Octagon oc1 = new Octagon(10);
        Octagon oc2 = (Octagon)oc1.clone();

        System.out.println("compareTo: " + (oc1.compareTo(oc2) == 0));
        System.out.println("equals: " + oc1.equals(oc2));
        System.out.println("Have the same reference? " + (oc1 == oc2));
    }
}   

