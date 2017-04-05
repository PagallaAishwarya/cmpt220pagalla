/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import lab9.TRIANGLE.IllegalTRIANGLEException;

/**
 *
 * @author aishw
 */
public class ASH1205 {

    public static void main(String[] args) {

        TRIANGLE t1;
        try {
            t1 = new TRIANGLE(1, 1, 2000);
        } catch (IllegalTRIANGLEException e) {
            e.printStackTrace();
        }

    }

}
    
